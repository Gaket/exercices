package ru.abdt.ba;

import junit.framework.Assert;

import org.junit.Test;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class FizzBuzzTest {

    @Test
    public void both() throws Exception {
        int i = 15;
        String ans = FizzBuzz.singleFizzBuzz(i);
        Assert.assertEquals("FizzBuzz", ans);
    }

    @Test
    public void fizz() throws Exception {
        int i = 6;
        String ans = FizzBuzz.singleFizzBuzz(i);
        Assert.assertEquals("Fizz", ans);
    }

    @Test
    public void buzz() throws Exception {
        int i = 10;
        String ans = FizzBuzz.singleFizzBuzz(i);
        Assert.assertEquals("Buzz", ans);
    }

    @Test
    public void number() throws Exception {
        int i = 17;
        String ans = FizzBuzz.singleFizzBuzz(i);
        Assert.assertEquals("17", ans);
    }
}