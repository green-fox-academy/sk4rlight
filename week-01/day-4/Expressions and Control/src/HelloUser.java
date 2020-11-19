import javax.swing.*;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User! Please type in your username:");
        String userInput1 = scanner.nextLine();
        System.out.println("Your username is: " + userInput1);
    }
}
