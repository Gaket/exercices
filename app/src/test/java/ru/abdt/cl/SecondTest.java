package ru.abdt.cl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class SecondTest {


    Second second;

    @Before
    public void setUp() throws Exception {
        second = new Second();

    }

    @Test
    public void name() throws Exception {
        Assert.assertEquals(4, second.solution(2, new int[]{0, 1, 1}));
    }

    @Test
    public void name2() throws Exception {
        Assert.assertEquals(1, second.solution(2, new int[]{0, 3, 1}));
    }

    @Test
    public void name3() throws Exception {
        Assert.assertEquals(4, second.solution(2, new int[]{-1, 2, 0, 3}));
    }

    @Test
    public void name4() throws Exception {
        Assert.assertEquals(0, second.solution(2, new int[]{-2, 0, 5}));
    }

    @Test
    public void name5() throws Exception {
        Assert.assertEquals(11, second.solution(2, new int[]{0, 1, 2, 1, 1}));
    }

    @Test
    public void name6() throws Exception {
        Assert.assertEquals(7, second.solution(6, new int[]{1, 8, -3, 0, 1, 3, -2, 4, 5}));
    }

    @Test
    public void name7() throws Exception {
        Assert.assertEquals(0, second.solution(0, new int[]{-2147483648, -2147483648}));
    }

    @Test
    public void name8() throws Exception {
        Assert.assertEquals(0, second.solution(0, new int[]{-2, -2}));
    }

    @Test
    public void name9() throws Exception {
        Assert.assertEquals(0, second.solution(0, new int[]{2147483647, 2147483647}));
    }

    @Test
    public void name10() throws Exception {
        Assert.assertEquals(0, second.solution(0, new int[]{1}));
    }

    @Test
    public void name11() throws Exception {
        Assert.assertEquals(0, second.solution(1, new int[]{1}));
    }
}