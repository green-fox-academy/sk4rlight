
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"

        Path file = Paths.get("my-file.txt");
        try {
            System.out.println(openThenPrintEachLine(file));
        } catch (IOException ie) {
            System.out.println("The file cannot be read.");
        }
    }
     public static List<String> openThenPrintEachLine(Path document) throws IOException {

        document = Paths.get("my-file.txt");


        List<String> result = Files.readAllLines(document);
        return result;
     }


}