package io.stevejamison;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by stevejaminson on 4/30/16.
 */
public class DisplaySpec {

    @Test
    public void getNumTest(){
        Display display = new Display();
        double expected = 15;
        double actual = display.getCurrentVal();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void getOperatorTest(){
        Display display = new Display();
        int expected = 8;
        int actual = display.getOperator();
        assertEquals(expected, actual);
    }

    @Test
    public void getSecondNum(){
        Display display = new Display();
        double expected = 5;
        double actual = display.getSecondNum();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void addToMemoryTest(){
        Display display = new Display();
        double expected = 15;
        double actual = display.addToMemory();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void resetMemoryTest(){
        Display display = new Display();
        double expected = 0;
        double actual = display.resetMemory();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void callMemoryTest(){
        Display display = new Display();
        double expected = 0;
        double actual = display.callMemory();
        assertEquals(expected, actual, .01);
    }
}
