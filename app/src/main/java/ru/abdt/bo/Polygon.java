package ru.abdt.bo;

import java.util.Scanner;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class Polygon {

    public static void main(String args[]) throws Exception {

        int squares = 0;
        int rects = 0;
        int others = 0;

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // read one row
            int[] edges = new int[4];
            for (int i = 0; i < 4; i++) {
                edges[i] = sc.nextInt();
            }

            // process it
            if (isSquare(edges)) {
                squares++;
            } else if (isRect(edges)) {
                rects++;
            } else {
                others++;
            }
        }

        System.out.printf("%d %d %d", squares, rects, others);
    }


    static boolean isSquare(int[] edge) {
        boolean isSquare = edge[0] > 0;
        int firstEdge = edge[0];
        for (int i = 0; i < 3; i++) {
            isSquare = isSquare && edge[i] == firstEdge;
        }
        return isSquare;
    }

    static boolean isRect(int[] edge) {
        boolean isRect = edge[0] > 0 && edge[0] == edge[2];
        isRect = isRect && edge[1] > 0 && edge[1] == edge[3];
        return isRect;
    }
}