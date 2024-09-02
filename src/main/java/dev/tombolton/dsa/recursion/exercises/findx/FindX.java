package dev.tombolton.dsa.recursion.exercises.findx;

public class FindX {
    public static int find(String string) {
        if (string.toLowerCase().charAt(0) == 'x') {
            return 0;
        }

        return find(string.substring(1), 1);
    }

    private static int find(String string, int index) {
        if (string.toLowerCase().charAt(0) == 'x') {
            return index;
        }

        return find(string.substring(1), index + 1);
    }
}
