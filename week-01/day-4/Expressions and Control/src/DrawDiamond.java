import java.util.Scanner;

public class DrawDiamond {
    // Write a program that reads a number from the standard input, then draws a
// diamond like this:
//              num = 4
//               i      *   space
//    *         i = 1   1   3       Math.abs(i - num) -
//   ***        i = 2   2   2
//  *****       i = 3   3   1           i -(num - i)
// *******      i = 4   4   0
//  *****       i = 5   3   1           i - |(num - 1)|
//   ***        i = 6   2   2
//    *         i = 7   1   3
//
// The diamond should have as many lines as the number was
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the number of rows you want until the half of your diamond.");

        int numberOfRows = scanner.nextInt();

        int i = 1;
        int j = 0;

        for (i = 1; i < 2 * (numberOfRows - 1) + 1 + 1; i++) {      //  shape of diamond
            for (j = 0; j < Math.abs(numberOfRows - i); j++) {      //  number of dots/spaces
                System.out.print(".");
            }
            for (j = 0; j < (2 * (numberOfRows - Math.abs(i - numberOfRows) - 1) + 1); j++) {               //  numbers of stars = absolute value of (i - numbers)
                System.out.print("*");

            }
            System.out.println();
        }

    }
}