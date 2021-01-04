package FoxExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    /*
    Exercise 10
        Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

        Write a Stream Expression to find the foxes with green color!
        Write a Stream Expression to find the foxes with green color, and age less then 5 years!
        Write a Stream Expression to find the frequency of foxes by color!
     */

    public static void main(String[] args) {
        Fox fox1 = new Fox("Fox1", "green", 2);
        Fox fox2 = new Fox("Fox2", "blue", 3);
        Fox fox3 = new Fox("Fox3", "red", 4);
        Fox fox4 = new Fox("Fox4", "black", 5);
        Fox fox5 = new Fox("Fox5", "green", 6);

        List<Fox> foxes = Arrays.asList(fox1, fox2, fox3, fox4, fox5);

        List<String> greenFoxesName = foxes.stream()
                .filter(fox -> fox.getColor().equals("green") )
                .map(Fox::getName)
                .collect(Collectors.toList());
        System.out.println(greenFoxesName);

        List<String> greenAndYoungFoxesName = foxes.stream()
                .filter(fox -> fox.getColor().equals("green") && fox.getAge() <= 5)
                .map(Fox::getName)
                .collect(Collectors.toList());
        System.out.println(greenAndYoungFoxesName);

        Map<String, Long> frequencyByColor = foxes.stream()
                .map(Fox::getColor)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyByColor);
    }



}
