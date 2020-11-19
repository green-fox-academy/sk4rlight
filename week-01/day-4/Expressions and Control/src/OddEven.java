import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number, then I'll tell you if it's an Odd or Even number.");

        int numberInput = scanner.nextInt();

        if (numberInput % 2 == 0) {
            System.out.println(numberInput + " is an Even number.");
        } else {
            System.out.println(numberInput + " is an Odd number.");
        }


    }
}
