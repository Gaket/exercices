package ru.abdt.ba;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class FindUnPaired {

    public static int find(int[] A) {
        Map<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            Integer curValue = values.get(A[i]);
            if (curValue == null) {
                curValue = 0;
            }
            curValue++;
            values.put(A[i], curValue);
        }

        for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
