package Anagram;
//# Anagram
//
//        - Write a function, that takes two strings and returns a boolean value based on
//        if the two strings are Anagramms or not.
//        - Create a test for that.

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

    public boolean isAnagram(String text1, String text2) {

        text1 = "binary";
        text2 = "brainy";

        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();

        for (int i = 0; i < text1.length(); i++) {
            listOne.add(Character.toString(text1.charAt(i)));
        }

        for (int j = 0; j < text2.length(); j++) {
            listOne.add(Character.toString(text2.charAt(j)));
        }

        Collections.sort(listOne);
        Collections.sort(listTwo);

        int totalIdenticalLetters = 0;

        if (listOne.size() == listTwo.size()) {
            for (int k = 0; k < listOne.size(); k++) {
                if (listOne.get(k).equals(listTwo.get(k))) {
                    totalIdenticalLetters++;
                } else {
                    totalIdenticalLetters += 0;
                }
            }

        }

        return totalIdenticalLetters == listOne.size();
    }
}


