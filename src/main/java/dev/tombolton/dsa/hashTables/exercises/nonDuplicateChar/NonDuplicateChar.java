package dev.tombolton.dsa.hashTables.exercises.nonDuplicateChar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonDuplicateChar {
    public static Character findFirstNonDuplicate(String testString) {
        HashMap<Character, Integer> letters = new LinkedHashMap<>();

        for (char c : testString.toLowerCase().toCharArray()) {
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}
