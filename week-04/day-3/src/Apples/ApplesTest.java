package Apples;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
    Apples myApple;
    @org.junit.Before
    public void setUp() throws Exception {
        myApple = new Apples();
    }

    @org.junit.Test
    public void getApple() {
        assertEquals("apple", myApple.getApple());
    }



}