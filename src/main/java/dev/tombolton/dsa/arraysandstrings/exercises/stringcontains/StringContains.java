package dev.tombolton.dsa.arraysandstrings.exercises.stringcontains;

/*
 * The best and average case scenarios for the given implementation in QUESTION.md are O(N).
 * This solution reduces the best case scenario to O(1)
 */
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
