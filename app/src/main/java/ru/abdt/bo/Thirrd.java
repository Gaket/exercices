package ru.abdt.bo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class Thirrd {

    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            lines.add(sc.nextLine());
        }

        if (lines.isEmpty()) {
            System.out.println("");
            return;
        }

        HashMap<String, Set<String>> words = new HashMap<>();

        for (String line : lines) {
            String sorted = sortedLetters(line);
            if (!words.containsKey(sorted)) {
                words.put(sorted, new TreeSet<String>());
            }
            words.get(sorted).add(line);
        }


        String[] anagrams = new String[words.size()];

        int i = 0;
        for (Set<String> strings : words.values()) {
            StringBuilder builder = new StringBuilder();
            for (String string : strings) {
                builder.append(string)
                        .append(",");
            }
            anagrams[i] = builder.substring(0, builder.length() - 2);
            i++;
        }
        Arrays.sort(anagrams);
        for (int i1 = 0; i1 < anagrams.length; i1++) {
            System.out.println(anagrams[i1]);
        }
    }

    static String sortedLetters(String word) {
        String wordWithoutSpaces = word.replace(" ", "");
        char[] chars = wordWithoutSpaces.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
