package ru.abdt.ba;

import java.util.Random;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class InPlaceShuffle {

    public static void shuffle(int[] array) {
        int temp;
        int swapIndex;
        for (int i = 0; i < array.length; i++) {
            swapIndex = getRandom(0, array.length);

            temp = array[i];
            array[i] = array[swapIndex];
            array[swapIndex] = temp;
        }
    }

    static int getRandom(int floor, int ceiling) {
        return new Random().nextInt(ceiling - floor) + floor;
    }
}
