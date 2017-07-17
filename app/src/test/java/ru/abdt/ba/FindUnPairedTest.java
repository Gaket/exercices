package ru.abdt.ba;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class FindUnPairedTest {

    @Test
    public void findSingle() throws Exception {
        int[] nums = {1};
        int value = FindUnPaired.find(nums);
        Assert.assertEquals(1, value);
    }

    @Test
    public void findSeveral() throws Exception {
        int[] nums = {2, 1, 2};
        int value = FindUnPaired.find(nums);
        Assert.assertEquals(1, value);
    }

    @Test
    public void findSeveral2() throws Exception {
        int[] nums = {2, 2, 3, 3, 4};
        int value = FindUnPaired.find(nums);
        Assert.assertEquals(4, value);
    }
}