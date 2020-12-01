import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

    public static void main(String[] args) {
        Path myFile = Paths.get("my-file.txt");
        try {
            System.out.println(numberOfLines(myFile));
        } catch (IOException ae) {
            System.out.println("Cannot open the file.");
        }
    }

    public static Integer numberOfLines(Path file) throws IOException {
        file = Paths.get("my-file.txt");
        List<String> lineList = Files.readAllLines(file);
        int lines = lineList.size();

        return lines;
    }
}

