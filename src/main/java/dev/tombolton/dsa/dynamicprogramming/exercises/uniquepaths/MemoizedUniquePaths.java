package dev.tombolton.dsa.dynamicprogramming.exercises.uniquepaths;

import java.util.HashMap;
import java.util.Map;

public class MemoizedUniquePaths {
    public static int countUniquePaths(int rows, int columns) {
        if (rows == 1 || columns == 1) return 1;

        Map<String, Integer> memo = new HashMap<>();

        String memoKey = getMemoKey(rows, columns);
        memo.put(memoKey, countUniquePaths(rows - 1, columns, memo) + countUniquePaths(rows, columns - 1, memo));

        return memo.get(memoKey);
    }

    private static int countUniquePaths(int rows, int columns, Map<String, Integer> memo) {
        if (rows == 1 || columns == 1) return 1;

        String memoKey = getMemoKey(rows, columns);
        if (!memo.containsKey(memoKey)) {
            memo.put(memoKey, countUniquePaths(rows - 1, columns) + countUniquePaths(rows, columns - 1));
        }

        return memo.get(memoKey);
    }

    private static String getMemoKey(int rows, int columns) {
        StringBuilder memoKeyBuilder = new StringBuilder();
        if (rows > columns) {
            memoKeyBuilder.append(rows);
            memoKeyBuilder.append('x');
            memoKeyBuilder.append(columns);
        } else {
            memoKeyBuilder.append(columns);
            memoKeyBuilder.append('x');
            memoKeyBuilder.append(rows);
        }

        return memoKeyBuilder.toString();
    }
}
