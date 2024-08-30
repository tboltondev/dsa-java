package dev.tombolton.dsa.recursion.examples;

public class CountingX {
    public static int count(String string) {
        if (string.isEmpty()) return 0;

        if (string.toLowerCase().charAt(0) == 'x') {
            return 1 + count(string.substring(1));
        } else {
            return count(string.substring(1));
        }
    }
}
