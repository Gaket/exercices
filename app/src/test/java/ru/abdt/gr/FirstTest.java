package ru.abdt.gr;

import junit.framework.Assert;

import org.junit.Test;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class FirstTest {

    @Test
    public void name() throws Exception {
        int[] first = {6, 42, 11, 7, 1, 42};
        int ans = First.solution(7, 42, first);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void name2() throws Exception {
        int[] first = {7, 42, 11, 7, 1, 42};
        int ans = First.solution(7, 42, first);
        Assert.assertEquals(5, ans);
    }

    @Test
    public void name3() throws Exception {
        int[] first = {};
        int ans = First.solution(7, 42, first);
        Assert.assertEquals(-1, ans);
    }

    @Test
    public void name4() throws Exception {
        int[] first = {7,42};
        int ans = First.solution(7, 42, first);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void name5() throws Exception {
        int[] first = {7};
        int ans = First.solution(7, 42, first);
        Assert.assertEquals(-1, ans);
    }

    @Test
    public void name6() throws Exception {
        int[] first = {7};
        int ans = First.solution(7, 7, first);
        Assert.assertEquals(0, ans);
    }

    @Test
    public void name7() throws Exception {
        int[] first = {1, 2, 2, 2, 1, 42};
        int ans = First.solution(1, 2, first);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void name8() throws Exception {
        int[] first = {1, 2, 2, 1};
        int ans = First.solution(1, 2, first);
        Assert.assertEquals(3, ans);
    }


    @Test
    public void name9() throws Exception {
        int[] first = {7, 121};
        int ans = First.solution(7, 42, first);
        Assert.assertEquals(-1, ans);
    }
}