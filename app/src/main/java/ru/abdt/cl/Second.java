package ru.abdt.cl;

import android.support.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class Second {

    public int solution(int K, int[] A) {

        Map<Integer, Integer> occurencies = getOccurenciesMap(A);

        int kComplementaryCount = 0;

        for (Map.Entry<Integer, Integer> numAndCount : occurencies.entrySet()) {
            if (numAndCount.getKey().equals(-2_147_483_648)) {
                // skip Integer.MIN_VALUE, because it definitely can't have the pair in this task
                continue;
            }
            int diff = K - numAndCount.getKey();
            if (occurencies.containsKey(diff)) {
                    kComplementaryCount += numAndCount.getValue() *  occurencies.get(diff);
            }
        }

        return kComplementaryCount;
    }

    private Map<Integer, Integer> getOccurenciesMap(int[] A) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (Integer i : A) {
            if (!numbers.containsKey(i)) {
                numbers.put(i, 0);
            }
            Integer currentCount = numbers.get(i);
            numbers.put(i, currentCount + 1);
        }
        return numbers;
    }
}
