package dev.tombolton.dsa.dynamicprogramming.exercises.golombsequence;

import java.util.HashMap;
import java.util.Map;

public class GolombSequence {
    public static int valueAt(int n) {
        if (n == 1) return 1;

        Map<Integer, Integer> memo = new HashMap<>();

        memo.put(n, 1 + valueAt(n - valueAt(valueAt(n - 1))));
        return memo.get(n);
    }

    private static int valueAt(int n, Map<Integer, Integer> memo) {
        if (n == 1) return 1;

        if (!memo.containsKey(n)) {
            memo.put(n, 1 + valueAt(n - valueAt(valueAt(n - 1, memo), memo), memo));
        }

        return memo.get(n);
    }
}
