import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);

        double kilometersPerMile = 1.609344;
        System.out.println("Please type in a distance in miles.");
        double mileToBeConverted = scanner.nextDouble();

        System.out.println("The " + mileToBeConverted + " miles are " + (kilometersPerMile * mileToBeConverted) + " in kilometres.");
    }
}
