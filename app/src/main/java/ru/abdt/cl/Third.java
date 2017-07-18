package ru.abdt.cl;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class Third {

    private Map<Integer, long[][]> cache = new HashMap<>();

    {
        long[][] fibMatrix = new long[][]{{1, 1}, {1, 0}};
        cache.put(1, fibMatrix);
    }

    public int solution(int N) {

        if (N == 0) {
            return 0;
        }

        if (N <= 2) {
            return 1;
        }

        long[][] answerMatrix = new long[][]{{1, 0}, {0, 1}};

        String binaryN = Integer.toBinaryString(N - 1);
        for (int i = 0; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') {
                long[][] fibMatrixPow = fibMatrixPowerN((int) Math.pow(2, (binaryN.length() - 1 - i)));
                answerMatrix = multiplyAndTrimMatrices(answerMatrix, fibMatrixPow);
            }
        }

        return (int) answerMatrix[0][0];
    }

    // this method works only for n that is some power of "2"
    private long[][] fibMatrixPowerN(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long[][] prevMatrix = fibMatrixPowerN(n / 2);
        long[][] thisMatrix = multiplyAndTrimMatrices(prevMatrix, prevMatrix);
        cache.put(n, thisMatrix);
        return thisMatrix;
    }

    private long[][] multiplyAndTrimMatrices(long[][] matrix1, long[][] matrix2) {
        long[][] answer = new long[2][2];
        answer[0][0] = matrix1[0][0] * matrix2[0][0] + matrix1[0][1] * matrix2[1][0];
        answer[0][1] = matrix1[0][0] * matrix2[0][1] + matrix1[0][1] * matrix2[1][1];
        answer[1][0] = matrix1[1][0] * matrix2[0][0] + matrix1[1][1] * matrix2[1][0];
        answer[1][1] = matrix1[1][0] * matrix2[0][1] + matrix1[1][1] * matrix2[1][1];

        trimMatrix(answer);
        return answer;
    }

    private void trimMatrix(long[][] matrix) {
        matrix[0][0] = matrix[0][0] % 1_000_000;
        matrix[0][1] = matrix[0][1] % 1_000_000;
        matrix[1][0] = matrix[1][0] % 1_000_000;
        matrix[1][1] = matrix[1][1] % 1_000_000;
    }
}
