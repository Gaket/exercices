package ru.abdt.gr;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class Third {

    public static final int COLUMNS_IN_LINE = 12;
    Map<String, Integer> columns = new HashMap<>();

    {
        columns.put("A",0);
        columns.put("B",1);
        columns.put("C",2);
        columns.put("D",4);
        columns.put("E",5);
        columns.put("F",6);
        columns.put("G",7);
        columns.put("H",9);
        columns.put("J",10);
        columns.put("K",11);
    }

    int getColumnPos(String columnLetter) {
        return columns.get(columnLetter);
    }

    int getTotalPos(int line, int pos) {
        return line * 12 + pos;
    }

    String[] splitToLines(String booked) {
        if (booked == null || booked.isEmpty()) {
            return new String[0];
        }
        String[] splitted = booked.split(" ");
        return splitted;
    }

    int calculatePos(String seat) {
        String line = "";
        String letter = "";
        for(int i = 0; i < seat.length(); i++) {
            if (Character.isDigit(seat.charAt(i))) {
                line += seat.charAt(i);
            } else {
                letter = String.valueOf(seat.charAt(i));
            }
        }
        int lineNum = Integer.valueOf(line) - 1;
        int columnPos = getColumnPos(letter);

        return getTotalPos(lineNum, columnPos);
    }

    int[] getWholeInitialSeatsStatus(int n) {
        int[] allSeats = new int[n * COLUMNS_IN_LINE]; // zeros by default

        fillCorridors(allSeats, n);

        return allSeats;
    }

    private void fillCorridors(int[] allSeats, int lines) {
        for (int i = 0; i < lines; i++) {
            allSeats[i * COLUMNS_IN_LINE + 3] = 1;
            allSeats[i * COLUMNS_IN_LINE + 8] = 1;
        }
    }

    private void fillBooked(int[] allSeats,  String[] allBookedSeats) {
        if (allBookedSeats.length == 0) {
            return;
        }
        for (String oneSeat : allBookedSeats) {
            int pos = calculatePos(oneSeat);
            allSeats[pos] = 1;
        }
    }

    int calculateThreeSeatsInRowNumber(int[] seats){
        int total = 0;
        int current = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                current++;
                if (current == 3) {
                    total++;
                    current = 0;
                }
            } else {
                current = 0;
            }
        }
        return total;
    }

    public int solution(int N, String S) {
        int[] seats = getWholeInitialSeatsStatus(N);

        String[] allBookedSeats = splitToLines(S);
        fillBooked(seats, allBookedSeats);

        return calculateThreeSeatsInRowNumber(seats);
    }
}
