import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatanateCharsToString {
    public static void main(String[] args) {
       /* Exercise 8
        Write a Stream Expression to concatenate a Character list to a string!
        */

        List<Character> characterList = Arrays.asList(
                'a', 'B', 'C', 'D', 'z', 'F', 'n', 'O', 'C'
        );

        String string = characterList.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(string);
    }
}