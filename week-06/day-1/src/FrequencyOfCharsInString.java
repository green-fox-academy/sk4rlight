import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharsInString {
    public static void main(String[] args) {
        /*
        Exercise 9
        Write a Stream Expression to find the frequency of characters in a given string!
         */

        String string = "AAAABBBBBBBBBBBBBBCCCCCCCCCCCCCCDDDDDDDDDDDDEEEEEEFFFFFFFFFFGGGGHIKLL";

        //    HashMap<String, Integer> characters = new HashMap<>();
        //    string.chars()
        //            .mapToObj(c -> (char) c)
        //            .collect(Collectors.toMap())

        Map<Character, Long> characters = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characters);
    }
}
