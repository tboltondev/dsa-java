package dev.tombolton.dsa.recursion.exercises.uniquepaths;

public class UniquePaths {
    public static int countUniquePaths(int rows, int columns) {
        if (rows == 1 || columns == 1) return 1;
        return countUniquePaths(rows - 1, columns) + countUniquePaths(rows, columns - 1);
    }
}
