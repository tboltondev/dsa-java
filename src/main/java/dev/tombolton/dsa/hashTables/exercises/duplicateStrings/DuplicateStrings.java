package dev.tombolton.dsa.hashTables.exercises.duplicateStrings;

import java.util.HashMap;

public class DuplicateStrings {
    public static String findDuplicate(String[] strings) {
        HashMap<String, Boolean> hashMap = new HashMap<>();

        for (String value : strings) {
            if (hashMap.containsKey(value)) {
                return value;
            } else {
                hashMap.put(value, true);
            }
        }

        return null;
    }
}
