
// Given base and n that are both 1 or more, compute recursively (no loops) the
// value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {

    public static void main(String[] args) {
        int base = 5;
        int n = 4;

        System.out.println(generatePowerOf(base, n));

    }


    public static int generatePowerOf(int base, int n) {
        if (n == 1 && base >= 1) {
            return base;
        } else {
            return generatePowerOf(base, n - 1) * base;
        }

    }

}
