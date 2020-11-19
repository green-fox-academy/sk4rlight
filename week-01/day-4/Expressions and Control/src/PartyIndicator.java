import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        //
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount of girls coming to tonight's party.");
        int numberOfGirls = scanner.nextInt();

        System.out.println("Please enter the amount of guys coming to tonight's party.");
        int numberOfGuys = scanner.nextInt();

        if (numberOfGirls + numberOfGuys >= 20) {
            System.out.println("The party is excellent!");
        } else if (numberOfGirls + numberOfGuys >= 20 && numberOfGirls % numberOfGuys != 1) {
            System.out.println("Quity cool party!");
        } else if (numberOfGirls + numberOfGuys < 20) {
            System.out.println("Average party...");
        } else if (numberOfGirls == 0 && numberOfGuys >= 1) {
            System.out.println("Sausage party");
        } else if (numberOfGirls + numberOfGuys == 0) {
            System.out.println("No one fucking comes to your party bro");
        } else {
            System.out.println("Let me ask my dog if I'm available, okay?");
        }
    }
}
