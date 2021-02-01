package com.hexa.junitandespressotesting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, Helper.addition(2, 2));
    }

    @Test
    public void subtraction_isCorrect() {
        assertEquals(3, Helper.subtraction(5, 2));
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        assertEquals(212, Helper.convertCelsiusToFahrenheit(100), 0.001);
    }
}