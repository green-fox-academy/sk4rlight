import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// square like this:
//          num = 6
//          %   .
// %%%%%%
// %....%
// %....%
// %....%
// %....%
// %%%%%%
//
// The square should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the length of the square.");

        int num = scanner.nextInt();

        int i = 0;
        int j = 0;

        for (i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {
                System.out.print("%");
            }
            System.out.print("%");
            System.out.println();
        }
    }
}
