package dev.tombolton.dsa.arraysAndStrings.exercises.stringContains;

class StringContains {
    public static boolean containsX(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'X') {
                return true;
            }
        }

        return false;
    }
}
