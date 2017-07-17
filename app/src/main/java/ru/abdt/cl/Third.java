package ru.abdt.cl;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class Third {

    Map<Integer, Integer[][]> cache = new HashMap<>();

    {
        Integer[][] fibMatrix = new Integer[][]{{1, 1}, {1, 0}};
        Integer[][] zeroMatrix = new Integer[][]{{1, 0}, {0, 1}};
        cache.put(0, zeroMatrix);
        cache.put(1, fibMatrix);
    }

    public int solution(int N) {

        if (N == 0) {
            return 0;
        }

        if (N <= 2) {
            return 1;
        }

        BigInteger last = new BigInteger("1");
        BigInteger prev = new BigInteger("1");
        BigInteger ans = new BigInteger("0");

        for (int i = 2; i < N; i++) {
            ans = last.add(prev);
            prev = last;
            last = ans;
            prev = prev.remainder(new BigInteger("1000000"));
            last = last.remainder(new BigInteger("1000000"));
        }

        BigInteger answer = ans.remainder(new BigInteger("1000000"));
        return answer.intValue();
    }

    public int solutionOpt(int N) {

        if (N == 0) {
            return 0;
        }

        if (N <= 2) {
            return 1;
        }


        Integer[][] answerMatrix = new Integer[][]{{1, 0}, {0, 1}};

        String binaryN = Integer.toBinaryString(N);
        for (int i = 0; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') {
                Integer[][] fibMatrixPow = fibMatrixPowerN((int) Math.pow(2,i));
                answerMatrix = multiplyMatrices(answerMatrix, fibMatrixPow);
            }
        }

        answerMatrix = fibMatrixPowerN(N);

        return answerMatrix[0][0];
    }

    public Integer[][] fibMatrixPowerN(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        Integer[][] prevMatrix = fibMatrixPowerN(n / 2);
        Integer[][] thisMatrix = multiplyMatrices(prevMatrix, prevMatrix);
        cache.put(n, thisMatrix);
        return thisMatrix;
    }

    public Integer[][] multiplyMatrices(Integer[][] matrix1, Integer[][] matrix2) {
        Integer[][] answer = new Integer[2][2];
        answer[0][0] = matrix1[0][0] * matrix2[0][0] + matrix1[0][1] * matrix2[1][0];
        answer[0][1] = matrix1[0][0] * matrix2[0][1] + matrix1[0][1] * matrix2[1][1];
        answer[1][0] = matrix1[1][0] * matrix2[0][0] + matrix1[1][1] * matrix2[1][0];
        answer[1][1] = matrix1[1][0] * matrix2[0][1] + matrix1[1][1] * matrix2[1][1];
        return answer;
    }
}
