import java.util.Scanner;

public class DivideByZero {
    // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

    public static void main(String[] args) {
        System.out.println("Please enter a number for me to divide ten with.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        try {
            System.out.println(divideTenByNumber(input));

        } catch (ArithmeticException ae) {
            System.out.println("Can't divide by zero.");
        }

    }

    public static int divideTenByNumber(int number) {
        int result = 10 / number;
        return result;
    }

}
