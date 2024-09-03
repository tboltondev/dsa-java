package dev.tombolton.dsa.dynamicprogramming.examples;

import java.util.Map;

public class Fibonacci {
    public static Integer valueAt(Integer n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) return n;

        if (!memo.containsKey(n)) {
            memo.put(n, valueAt(n - 2, memo) + valueAt(n - 1, memo));
        }

        return memo.get(n);
    }
}
