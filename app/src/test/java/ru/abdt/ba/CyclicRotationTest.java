package ru.abdt.ba;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class CyclicRotationTest {
    @Test
    public void solution() throws Exception {
        int[] a = {1, 2, 3};
        int[] actual = CyclicRotation.solution(a, 2);
        Assert.assertArrayEquals(new int[]{2,3,1}, actual);
    }

    @Test
    public void cycle() throws Exception {
        int[] a = {1, 2, 3};
        int[] actual = CyclicRotation.solution(a, 5);
        Assert.assertArrayEquals(new int[]{2,3,1}, actual);
    }

}