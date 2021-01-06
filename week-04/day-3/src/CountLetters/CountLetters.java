package CountLetters;

import java.util.HashMap;

// # Count Letters
//
// - Write a function, that takes a string as an argument and returns a dictionary
//   with all letters in the string as keys, and numbers as values that shows how
//   many occurrences there are.
// - Create a test for that.

public class CountLetters {

    public static void main(String[] args) {
        String text = "ABBCCCDDDDEEEEEFFFFFFGGGGGG";
        makeDictionary(text);
    }

    public static HashMap<String, Integer> makeDictionary(String text) {

        HashMap<String, Integer> dictionary = new HashMap<>();

        int value = 0;

        String[] splitLetters = text.split("");
        for (String split : splitLetters) {
            if (dictionary.containsKey(split)) {
                dictionary.put(split, value++);
            } else {
                dictionary.put(split, value);
            }
        }

        return dictionary;
    }

}
