package dev.tombolton.dsa.recursion.exercises.charactercount;

import java.util.Arrays;

public class CharacterCount {
    public static int count(String[] strings) {
        if (strings.length == 1) {
            return strings[0].length();
        }

        return strings[0].length() + count(Arrays.copyOfRange(strings, 1, strings.length));
    }
}
