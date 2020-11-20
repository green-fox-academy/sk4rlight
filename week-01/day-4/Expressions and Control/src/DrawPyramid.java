import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//              input = 4,
//    *         i = 1, j = i + 3, input - i db space, i db *        1 + 2 * (i - 1)
//   ***        i = 2, j = i + 3, j-i db space,
//  *****
// *******
//
// The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of rows you want in your pyramid.");

        int numberOfRows = scanner.nextInt();

        int i = 1;
        int j = 0;
    //    int k = 0;

        for (i = 1; i < numberOfRows + 1; i++) {
            for (j = 0; j < numberOfRows - i; j++) {
                System.out.print(".");
            }
            for (j = 0; j < (2 * (i - 1) + 1); j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}