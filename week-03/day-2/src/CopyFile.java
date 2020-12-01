import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class CopyFile {
// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

    public static void main(String[] args) {
        String fileName1 = "my-file.txt";
        String fileName2 = "my-file2.txt";


        System.out.println(isCopySuccessful(Paths.get(fileName1), Paths.get(fileName2)));


        System.out.println("Cannot copy the files.");
    }


    public static boolean isCopySuccessful(Path filename1, Path filename2) {
        boolean result = true;
        try {
            Files.copy(filename1, filename2, StandardCopyOption.REPLACE_EXISTING);

            // Files.write(filename1, filename2, StandardOpenOption.) //
            List<String> listOne = Files.readAllLines(filename1);
            List<String> listTwo = Files.readAllLines(filename2);

            if (listOne.equals(listTwo)) {
                result = true;
            } else {
                result = false;
            }


        } catch (IOException a) {
            System.out.println("The copy was unsuccessful.");
        }
        return result;
    }


}
