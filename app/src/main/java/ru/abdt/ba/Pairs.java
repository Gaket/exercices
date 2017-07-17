package ru.abdt.ba;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class Pairs {

    static int numberOfPairs(int[] a, long k) {
        if (a.length < 2) return 0;

        List<Integer> numbersList = getInputsList(a);
        Set<Pair> pairs = new HashSet<>();
        Collections.sort(numbersList);

        if (numbersList.size() > 1
                && numbersList.get(numbersList.size() - 2) + numbersList.get(numbersList.size() - 1) < k) {
            // if sum of the biggest two elements less than needed number, there are no such elements
            return 0;
        }

        for (int i = 0; i < a.length && a[i] <= k / 2; i++) {
            int currentNumber = a[i];
            int possiblePair = (int) k - currentNumber; // we can cast here, because all our pairs made of integers
            if (numbersList.contains(possiblePair)) {
                // we probably have a required pair
                // however, we should check that is is a separate number, not the same as the taken
                // e.g. numbers = 1,3,5 and sum = 6 should not contain pair (3,3)
                if (currentNumber == possiblePair) {
                    // check if we have at least two such numbers to get a pair
                    // remembering that list is already sorted
                    if (i < a.length - 1 && a[i + 1] == currentNumber) {
                        pairs.add(new Pair(currentNumber, possiblePair));
                    }
                } else {
                    pairs.add(new Pair(currentNumber, possiblePair));
                }
            }
        }
        return pairs.size();
    }

    @NonNull
    private static List<Integer> getInputsList(int[] numbers) {
        List<Integer> numbersList = new ArrayList<>();
        for (int number : numbers) {
            numbersList.add(number);
        }
        return numbersList;
    }

    private static class Pair {

        private int a;
        private int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;

            return (a == pair.a && b == pair.b)
                    || (a == pair.b && b == pair.a);
        }

        @Override
        public int hashCode() {
            return a + b;
        }
    }
}
