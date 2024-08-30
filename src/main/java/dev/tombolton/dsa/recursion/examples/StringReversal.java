package dev.tombolton.dsa.recursion.examples;

public class StringReversal {
    public static String reverse(String string) {
        if (string.length() == 1) return string.substring(0, 1);
        return reverse(string.substring(1)) + string.charAt(0);
    }
}
