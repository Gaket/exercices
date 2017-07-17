package ru.abdt.bo;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class PolygonTest {


    @Test
    public void name10() throws Exception {


    }

    @Test
    public void name() throws Exception {
        Assert.assertTrue(Polygon.isSquare(new int[]{2, 2, 2, 2}));

    }


    @Test
    public void name2() throws Exception {
        Assert.assertFalse(Polygon.isSquare(new int[]{1, 2, 2, 2}));

    }

    @Test
    public void name3() throws Exception {
        Assert.assertFalse(Polygon.isRect(new int[]{1, 2, 2, 2}));
    }

    @Test
    public void name4() throws Exception {
        Assert.assertTrue(Polygon.isRect(new int[]{1, 2, 1, 2}));
    }

    @Test
    public void name5() throws Exception {
        Assert.assertFalse(Polygon.isRect(new int[]{-2, 2, -2, 2}));
    }

    @Test
    public void name6() throws Exception {
        Assert.assertFalse(Polygon.isRect(new int[]{-2, -2, -2, -2}));
    }

    @Test
    public void name7() throws Exception {
        Assert.assertFalse(Polygon.isRect(new int[]{0,0,0,0}));
    }
}