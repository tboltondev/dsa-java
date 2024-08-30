package dev.tombolton.dsa.recursion.examples;

import java.util.Arrays;

public class ArraySum {
    public static int sum(int[] array) {
        if (array.length == 1) return array[0];
        return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
    }
}
