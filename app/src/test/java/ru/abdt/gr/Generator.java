package ru.abdt.gr;

import java.util.Random;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class Generator {

    public static int largeInt() {
        return Integer.MAX_VALUE;
    }

    public static int[] largeArray(int len) {
        int[] array = new int[len];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt();
        }
        return array;
    }
}
