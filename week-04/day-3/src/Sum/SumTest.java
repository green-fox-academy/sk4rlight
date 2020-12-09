package Sum;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
    Sum sum;
    // ha statikus lenne akkor nem kell a Sum-t peldanyositani
        // public static class Sum
        // így a before-ra se lenne szükség
    ArrayList<Integer> myList;

    @Before
    public void setUp() {
        sum = new Sum();

    }

    @Test
    public void isValueOfSum() {
        ArrayList<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(4);
        myList.add(3);
        myList.add(7);
        assertEquals(15, sum.sum(myList));
    }

    @Test
    public void testingAnotherSum() {
        ArrayList<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(10);

        assertEquals(20, sum.sum(myList));
    }

    @Test
    public void testWithEmptyList() {
        ArrayList<Integer> myList = new ArrayList();
        assertEquals(0, sum.sum(myList));
    }

    @Test
    public void testOnOneElement() {
        ArrayList<Integer> myList = new ArrayList();
        myList.add(3);
        assertEquals(20, sum.sum(myList));
    }

    @Test
    public void testWithANull()  {

        int expected = 0;
        int actual = sum.sum(null);
    //  vagy ha maga a lista null ->
    //  listában kezelni h null jön ki -> pl return 0;
    //
        assertEquals(expected, actual);
    }
}