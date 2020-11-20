import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *                Does this need to have a plugin to allow string append?
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of stars you want in the bottom row of the triangle.");
        int triangleNumber = scanner.nextInt();

        int i = 0;
        int j = 0;
        for (i = 0; i < triangleNumber; i++) {
            for (j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
