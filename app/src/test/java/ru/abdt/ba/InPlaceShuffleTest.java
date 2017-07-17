package ru.abdt.ba;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class InPlaceShuffleTest {
    @Test
    public void shuffle() throws Exception {
        Map<String, Integer> occurences = new HashMap<>();

        for (int i = 0; i < 10000000; i++) {
            int[] array = {1, 2, 3};
            InPlaceShuffle.shuffle(array);
            String arr = printArray(array);
            Integer num = occurences.get(arr);
            if (num == null) {
                num = 0;
            }
            num++;
            occurences.put(arr, num);
        }

        printMap(occurences);
    }

    String printArray(int[] array) {
        return "" + array[0] + array[1] + array[2];
    }

    void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
        }
    }
}