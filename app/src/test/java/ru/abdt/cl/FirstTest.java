package ru.abdt.cl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class FirstTest {

    First first;

    @Before
    public void setUp() throws Exception {
        first = new First();

    }

    @Test
    public void name() throws Exception {
        int[] ar = new int[]{1, 1, -1, 1};
        Assert.assertEquals(-1, first.solution(ar));

    }

    @Test
    public void name2() throws Exception {
        int[] ar = new int[]{2, 3, -1, 1, 3};
        Assert.assertEquals(4, first.solution(ar));
    }


    @Test
    public void name3() throws Exception {
        int[] ar = new int[]{-32, 3, -1, 1, -3};
        Assert.assertEquals(1, first.solution(ar));
    }

    @Test
    public void name6() throws Exception {
        int[] ar = new int[]{2, 3, -1, 1, -5};
        Assert.assertEquals(4, first.solution(ar));
    }

    @Test
    public void name4() throws Exception {
        int[] ar = new int[]{-3222, 3, -1, 1, -3};
        Assert.assertEquals(1, first.solution(ar));
    }

    @Test
    public void name5() throws Exception {
        int[] ar = new int[]{10, 3, -1, 1, -3};
        Assert.assertEquals(1, first.solution(ar));
    }
}