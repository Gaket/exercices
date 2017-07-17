package ru.abdt.gr;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class SecondTest {

    @Test
    public void name() throws Exception {
        Assert.assertEquals(1, Second.solution(1, 3));
    }
    @Test
    public void name2() throws Exception {
        Assert.assertEquals(2, Second.solution(1, 4));
    }

    @Test
    public void name3() throws Exception {
        Assert.assertEquals(3, Second.solution(1, 9));
    }

    @Test
    public void name4() throws Exception {
        Assert.assertEquals(3, Second.solution(1, 10));
    }
    @Test
    public void name5() throws Exception {
        Assert.assertEquals(2, Second.solution(1, 5));
    }

    @Test
    public void name6() throws Exception {
        Assert.assertEquals(14718, Second.solution(1000000000, 2147483647));
    }

    @Test
    public void name7() throws Exception {
        Assert.assertEquals(3, Second.solution(-1000000000, 5));
    }

    @Test
    public void name8() throws Exception {
        Assert.assertEquals(0, Second.solution(-1000000000, -1));
    }
}