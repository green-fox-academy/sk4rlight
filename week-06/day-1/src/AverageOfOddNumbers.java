import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageOfOddNumbers {
    public static void main(String[] args) {
        /*
        Exercise 4
        Write a Stream Expression to get the average value of the odd numbers from the following list:

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
         */

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        OptionalDouble averageNumbers = numbers.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(x -> x)
                .average();

            if (averageNumbers.isPresent()) {
                System.out.println(averageNumbers.getAsDouble());
            } else {
                System.out.println("Nem számolható átlag.");
            }


    }
}
