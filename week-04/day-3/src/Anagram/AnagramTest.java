package Anagram;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram anagram;

    @Before
    public void setUp() throws Exception {
        anagram = new Anagram();
    }

    @Test
    public void isAnagram() {
        String text1 = "brainy";
        String text2 = "binary";
        boolean expected = true;
        boolean actual = anagram.isAnagram(text1, text2);
        assertEquals(expected, actual);
    }
}