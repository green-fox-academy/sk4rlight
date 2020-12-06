// The fibonacci sequence is a famous bit of mathematics,
// and it happens to have a recursive definition.
// The first two values in the sequence are 0 and 1 (essentially 2 base cases).
// Each subsequent value is the sum of the previous two values,
// so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
// Define a recursive fibonacci(n) method that
// returns the nth fibonacci number,
// with n=0 representing the start of the sequence.

public class Fibonacci {

    public static void main(String[] args) {
        int n = 7;
        System.out.println("The element on the n-th index of the Fibonacci sequence is: "+ fibonacciSequence(n));

    }

    public static int fibonacciSequence(int n) {
        int sum;
        if (n <= 1 && n >= 0) {
            return n;
        } else if (n > 1) {
            return sum = fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
        }
        return 0;
    }


}
