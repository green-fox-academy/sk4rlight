import java.util.Arrays;
import java.util.List;

public class StartsWithGivenLetters {
    public static void main(String[] args) {
        /*
        Exercise 7

        Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        */

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        String letter = "L";

        cities.stream()
                .filter(x -> x.startsWith(letter))
                .forEach(System.out::println);


    }
}
