package ru.abdt.cl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class ThirdTest {

    Third third;

    @Before
    public void setUp() throws Exception {
        third = new Third();

    }

    @Test
    public void name() throws Exception {
        Assert.assertEquals(0, third.solution(0));
        Assert.assertEquals(2, third.solution(3));
        Assert.assertEquals(5, third.solution(5));
        Assert.assertEquals(6765, third.solution(20));
        Assert.assertEquals(44301, third.solution(199));
        Assert.assertEquals(228875, third.solution(1000));

    }

    @Test
    public void big() throws Exception {
        Assert.assertEquals(746875, third.solution(100000));
        Assert.assertEquals(546875, third.solution(1000_000));
        Assert.assertEquals(546875, third.solution(100_000_000));
    }

    @Test
    public void power() throws Exception {
//        Assert.assertArrayEquals(new int[][]{{16, 21}, {28, 37}}, third.matrixPowTwo(new int[][]{{2, 3}, {4, 5}}));
    }

    @Test
    public void opt() throws Exception {
        Assert.assertEquals(21, third.solutionOpt(2));
    }
}