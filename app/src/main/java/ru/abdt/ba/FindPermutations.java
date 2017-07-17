package ru.abdt.ba;

import java.util.Arrays;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class FindPermutations {
    public static int solution(int[] A) {
        if (A.length == 0) return 0;

        Arrays.sort(A);
        if (A[0] != 1) return 0;
        for (int i = 0; i < A.length ; i++) {
            if (A[i] != i+1) return 0;
        }
        return 1;
    }
}
