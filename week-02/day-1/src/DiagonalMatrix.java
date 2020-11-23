import java.util.Scanner;

public class DiagonalMatrix {
    // - Create (dynamically*) a two dimensional array
    //   with the following matrix**. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    // * length should depend on a variable
    // ** Relax, a matrix is just like an array
    public static void main(String[] args) {
        System.out.println("Please input the number of rows in your matrix.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[][] matrix = new int[input][input];

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                matrix[i][j] = 0;
                matrix[i][i] = 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }


}
