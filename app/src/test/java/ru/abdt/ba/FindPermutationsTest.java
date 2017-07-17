package ru.abdt.ba;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class FindPermutationsTest {
    @Test
    public void solution() throws Exception {
        Assert.assertEquals(1, FindPermutations.solution(new int[]{1,2,3,4}));
    }

    @Test
    public void solutionBad() throws Exception {
        Assert.assertEquals(0, FindPermutations.solution(new int[]{1,2,3,3}));
    }

    @Test
    public void solutionBad2() throws Exception {
        Assert.assertEquals(0, FindPermutations.solution(new int[]{3, 1}));
    }

    @Test
    public void solutionEmpty() throws Exception {
        Assert.assertEquals(0, FindPermutations.solution(new int[]{}));
    }

}