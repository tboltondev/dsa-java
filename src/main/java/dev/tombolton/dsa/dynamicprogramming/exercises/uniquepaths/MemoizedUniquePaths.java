package dev.tombolton.dsa.dynamicprogramming.exercises.uniquepaths;

import java.util.HashMap;
import java.util.Map;

public class MemoizedUniquePaths {
    public static int countUniquePaths(int rows, int columns) {
        if (rows == 1 || columns == 1) return 1;

        Map<int[], Integer> memo = new HashMap<>();

        int[] memoKey = getMemoKey(rows, columns);
        memo.put(memoKey, countUniquePaths(rows - 1, columns, memo) + countUniquePaths(rows, columns - 1, memo));

        return memo.get(memoKey);
    }

    private static int countUniquePaths(int rows, int columns, Map<int[], Integer> memo) {
        if (rows == 1 || columns == 1) return 1;

        int[] memoKey = getMemoKey(rows, columns);
        if (!memo.containsKey(memoKey)) {
            memo.put(memoKey, countUniquePaths(rows - 1, columns) + countUniquePaths(rows, columns - 1));
        }

        return memo.get(memoKey);
    }

    private static int[] getMemoKey(int rows, int columns) {
        if (rows > columns) {
            return new int[]{rows, columns};
        } else {
            return new int[]{columns, rows};
        }
    }
}
