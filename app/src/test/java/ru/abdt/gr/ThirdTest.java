package ru.abdt.gr;

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
        String[] s = third.splitToLines("1A 3C 2B 3G 5A");
        for (String f : s) {
            System.out.println(f);
        }
    }

    @Test
    public void name1() throws Exception {
        Assert.assertEquals(3, third.solution(1, ""));
    }

    @Test
    public void name10() throws Exception {
        Assert.assertEquals(150, third.solution(50, ""));
    }

    @Test
    public void name11() throws Exception {
        Assert.assertEquals(149, third.solution(50, "1A 5G"));
    }

    @Test
    public void name12() throws Exception {
        Assert.assertEquals(148, third.solution(50, "1A 5F"));
    }


    @Test
    public void name2() throws Exception {
        Assert.assertEquals(2, third.solution(1, "1A"));
    }

    @Test
    public void name3() throws Exception {
        Assert.assertEquals(2, third.solution(1, "1F"));
    }

    @Test
    public void name4() throws Exception {
        Assert.assertEquals(2, third.solution(1, "1E"));
    }

    @Test
    public void name5() throws Exception {
        Assert.assertEquals(3, third.solution(1, "1D"));
    }

    @Test
    public void name6() throws Exception {
        Assert.assertEquals(3, third.solution(1, "1G"));
    }


    @Test
    public void name7() throws Exception {
        Assert.assertEquals(3, third.solution(2, "2B 1F 2K"));
    }

    @Test
    public void name8() throws Exception {
        Assert.assertEquals(4, third.solution(2, "1A 2F 1C"));
    }
}