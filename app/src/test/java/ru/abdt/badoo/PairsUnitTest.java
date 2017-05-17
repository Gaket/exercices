package ru.abdt.badoo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class PairsUnitTest {

    @Test
    public void emptyArray() throws Exception {
        int[] empty = {};
        int k = 6;
        int answer = Pairs.numberOfPairs(empty, k);
        assertEquals(answer, 0);
    }

    @Test
    public void singlePair() throws Exception {
        int[] array = {1, 5};
        int k = 6;
        int answer = Pairs.numberOfPairs(array, k);
        assertEquals(1, answer);
    }

    @Test
    public void duplicates() throws Exception {
        int[] array = {1, 5,5, 1};
        int k = 6;
        int answer = Pairs.numberOfPairs(array, k);
        assertEquals(1, answer);
    }

    @Test
    public void noPairs() throws Exception {
        int[] array = {1, 2,3, 2,3,1};
        int k = 10;
        int answer = Pairs.numberOfPairs(array, k);
        assertEquals(0, answer);
    }

    @Test
    public void half() throws Exception {
        int[] array = {3};
        int k = 6;
        int answer = Pairs.numberOfPairs(array, k);
        assertEquals(0, answer);
    }
}