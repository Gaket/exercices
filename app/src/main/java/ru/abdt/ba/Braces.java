package ru.abdt.ba;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class Braces {

    static final String YES = "YES";
    static final String NO = "NO";
    static Map<Character, Character> pairs = new HashMap<>();

    static {
        pairs.put('{', '}');
        pairs.put('(', ')');
        pairs.put('[', ']');
    }

    static String[] braces(String[] values) {
        String[] answer = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            answer[i] = checkIfStringIsBalanced(values[i]) ? YES : NO;
        }
        return answer;
    }

    static boolean checkIfStringIsBalanced(String input) {

        Stack<Character> braces = new Stack<>();
        boolean balanced = true;
        int i = 0;

        while (i < input.length()) {
            char nextSymbol = input.charAt(i);

            if (isOpeningBrace(nextSymbol)) {
                // we got opening braces
                braces.push(nextSymbol);
            } else if (isClosingBrace(nextSymbol)) {
                // we got closing brace

                if (braces.isEmpty()) {
                    // we got unmatched closing brace
                    balanced = false;
                    break;
                }

                char currentSymbol = braces.pop();
                if (!bracesAreTheSameType(nextSymbol, currentSymbol)) {
                    // we got closing brace of another type
                    balanced = false;
                    break;
                }
            } else {
                // Probably, there is problem with input
                // We can throw an exception or just log it depending from case
                continue;
            }
            i++;
        }
        return balanced && braces.isEmpty();
    }

    private static boolean bracesAreTheSameType(char nextSymbol, char last) {
        return pairs.get(last).equals(nextSymbol);
    }

    private static boolean isClosingBrace(char nextSymbol) {
        return pairs.containsValue(nextSymbol);
    }

    private static boolean isOpeningBrace(char nextSymbol) {
        return pairs.keySet().contains(nextSymbol);
    }
}
