public class SumDigits {
    // Given a non-negative integer n, return the sum of it's digits recursively
// (without loops).
//
// Hint
//
// Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//
// Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
    public static void main(String[] args) {
        int n = 341;
        int base = 10;
        int numberLength = Integer.toString(n).length();

        System.out.println(addTheDigits(n, base, numberLength));
        System.out.println(addTheDigitsSimplerway(n));

    }

    public static int addTheDigits(int n, int base, int exp) {       //base =10;
        if (n >= 0 && exp == 1) {
            return n % base;
        } else {
            return addTheDigits(n, base, exp - 1) + ((n / (int) (Math.pow(base, exp - 1))) % base);
        }
    }

    public static int addTheDigitsSimplerway(int n){
        if (n ==0 ){
            return n % 10;
        } else {
            return n % 10 + addTheDigitsSimplerway(n/10) % 10;
        }
    }
}
