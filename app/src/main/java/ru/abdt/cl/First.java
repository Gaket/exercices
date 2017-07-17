package ru.abdt.cl;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class First {

    public int solution(int[] A) {

        int cursor = 0;
        int step = 0;
        boolean[] checked = new boolean[A.length];

        while (true) {
            step++;
            cursor = cursor + A[cursor];
            if (cursor >= A.length || cursor < 0) {
                return step;
            }
            if (checked[cursor]) {
                return -1;
            }
            checked[cursor] = true;
        }
    }
}
