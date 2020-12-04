public class NumberAdder {
    // Write a recursive function that takes one parameter: n and
// adds numbers from 1 to n.

    public static void main(String[] args) {

        int n = 5;

        System.out.println("The sum of numbers is: " + addTheNumbers(n));

    }

    public static int addTheNumbers(int n) {

        if (n == 1) {
            return n;
        } else {
            return n + addTheNumbers(n - 1);
        }
    }
}

