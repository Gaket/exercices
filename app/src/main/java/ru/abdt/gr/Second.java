package ru.abdt.gr;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class Second {

    public static int solution(int a, int b) {
        int leftSquare;
        int rightSquare;

        leftSquare = a < 0 ? 0 : (int) Math.ceil(Math.sqrt(a));
        rightSquare = b < 0 ? 0 : (int) Math.floor(Math.sqrt(b));

        if (leftSquare == 0 && leftSquare == rightSquare) {
            return 0;
        }
        return rightSquare - leftSquare + 1;
    }
}
