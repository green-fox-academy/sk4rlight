import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        System.out.println("Please type in your name.");
        Scanner scanner = new Scanner(System.in);
        String nameInput = scanner.next();
        try {
            makeLineDocument(nameInput);
        } catch (IOException a) {
            System.out.println("Cannot write into file.");
        }

    }

    public static void makeLineDocument(String name) throws IOException {
        Path document = Paths.get("my-file.txt");
        ArrayList<String> listName = new ArrayList<>();
        listName.add(name);
        Files.write(document, listName);

    }

}
