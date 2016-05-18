package io.stevejamison;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
/**
 * Created by stevejaminson on 4/30/16.
 */
public class CalculatorSpec {

    @Test
    public void addTest(){
        Calculator calc = new Calculator();
        double expected = 20;
        double actual = calc.add();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void subtractTest(){
        Calculator calc = new Calculator();
        double expected = 10;
        double actual = calc.subtract();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void multiplyTest(){
        Calculator calc = new Calculator();
        double expected = 75;
        double actual = calc.multiply();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void divideTest(){
        Calculator calc = new Calculator();
        double expected = 3;
        double actual = calc.divide();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void squareTest(){
        Calculator calc = new Calculator();
        double expected = 225;
        double actual = calc.square();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void squareRootTest(){
        Calculator calc = new Calculator();
        double expected = 3.87;
        double actual = calc.squareRoot();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void exponentTest(){
        Calculator calc = new Calculator();
        double expected = 759375;
        double actual = calc.exponent();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void inverseTest(){
        Calculator calc = new Calculator();
        double expected = .066;
        double actual = calc.inverse();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void invertSignTest(){
        Calculator calc = new Calculator();
        double expected = -15;
        double actual = calc.invertSign();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void sineTest(){
        Calculator calc = new Calculator();
        double expected = .650;
        double actual = calc.sine();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void cosineTest(){
        Calculator calc = new Calculator();
        double expected = -.759;
        double actual = calc.cosine();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void tangentTest(){
        Calculator calc = new Calculator();
        double expected = -.855;
        double actual = calc.tangent();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void invSineTest(){
        Calculator calc = new Calculator();
        double expected = Double.NaN;
        double actual = calc.invSine();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void invCosineTest(){
        Calculator calc = new Calculator();
        double expected = Double.NaN;
        double actual = calc.invCosine();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void invTangent(){
        Calculator calc = new Calculator();
        double expected = 1.504;
        double actual = calc.invTangent();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void logTest(){
        Calculator calc = new Calculator();
        double expected = 1.176;
        double actual = calc.log();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void naturalLogTest(){
        Calculator calc = new Calculator();
        double expected = 2.708;
        double actual = calc.naturalLog();
        assertEquals(expected, actual, .01);
    }

    @Test
    public void invNaturalLogTest(){
        Calculator calc = new Calculator();
        double expected = 3269017.372;
        double actual = calc.invNaturalLog();
        assertEquals(expected, actual, .01);
    }
}
