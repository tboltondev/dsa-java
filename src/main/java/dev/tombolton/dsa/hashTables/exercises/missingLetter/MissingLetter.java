package dev.tombolton.dsa.hashTables.exercises.missingLetter;

import java.util.HashMap;

public class MissingLetter {
    public static Character findMissingLetter(String testString) {
        HashMap<Character, Boolean> letters = new HashMap<>();

        for (char c : testString.toLowerCase().toCharArray()) {
            letters.put(c, true);
        }

        for (char l = 'a'; l <= 'z'; l++) {
            if (!letters.containsKey(l)) {
                return l;
            }
        }

        return null;
    }
}
