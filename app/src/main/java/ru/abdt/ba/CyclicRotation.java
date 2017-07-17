package ru.abdt.ba;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class CyclicRotation {

    public static int[] solution(int[] A, int k) {
        if (k <= 0) return A;
        if (A.length == 0) return A;

        int[] result = new int[A.length];
        int actualK = k % A.length;
        System.arraycopy(A, 0, result, actualK, A.length - actualK);
        System.arraycopy(A, A.length - (actualK), result, 0, actualK);
        return result;
    }
}
