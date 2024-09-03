package dev.tombolton.dsa.dynamicprogramming.exercises.adduntil100;

import java.util.Arrays;

public class AddUntil100 {
    public static int add(int[] array) {
        if (array.length == 0) return 0;

        int totalOfRemainder = add(Arrays.copyOfRange(array, 1, array.length));

        if (array[0] + totalOfRemainder > 100) {
            return add(Arrays.copyOfRange(array, 1, array.length));
        }

        return array[0] + totalOfRemainder;
    }
}
