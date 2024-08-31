package dev.tombolton.dsa.recursion.examples;

import java.util.ArrayList;
import java.util.List;

public class AnagramGenerator {
    public static List<String> generate(String string) {
        if (string.length() == 1) return List.of(string.substring(0, 1));

        List<String> collection = new ArrayList<>();
        List<String> anagrams = generate(string.substring(1));

        for (String anagram : anagrams) {
            for (int i = 0; i < anagram.length(); i++) {
                String newAnagram = new StringBuilder(anagram).insert(i, string.charAt(0)).toString();
                collection.add(newAnagram);
            }
        }

       return collection;
    }
}
