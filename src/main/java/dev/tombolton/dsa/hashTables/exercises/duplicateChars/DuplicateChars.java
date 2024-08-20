package dev.tombolton.dsa.hashTables.exercises.duplicateChars;

import java.util.HashMap;

public class DuplicateChars {
    public static Character findDuplicate(Character[] chars) {
        HashMap<Character, Boolean> hashMap = new HashMap<>();

        for (Character value : chars) {
            if (hashMap.containsKey(value)) {
                return value;
            } else {
                hashMap.put(value, true);
            }
        }

        return null;
    }
}
