public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.
        int i = 1;
        while (i < 101) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
                i += 1;
            } else if (i % 3 == 0 && 1 % 5 != 0) {
                System.out.println("Fizz");
                i += 1;
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
                i += 1;
            } else {
                System.out.println(i);
                i += 1;
            }
        }
    }
}
