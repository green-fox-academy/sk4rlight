import java.util.Scanner;

public class Summing {
    // Create the usual class wrapper and main method on your own.

    // Write a function called `sum` that returns the
// sum of numbers from zero to the given parameter
    public static void main(String[] args) {
        System.out.println(sum());                  // hiányzik a ehhh
        int sum;
    }

    public static Integer sum(Integer input) {
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        int[] inputArray = {};
        int summedNumbers = 0;
        for (int i = 0; i < input; i++) {
            inputArray[i] = i;
            summedNumbers = summedNumbers + inputArray[i];
        }


        return summedNumbers;
    }
}
