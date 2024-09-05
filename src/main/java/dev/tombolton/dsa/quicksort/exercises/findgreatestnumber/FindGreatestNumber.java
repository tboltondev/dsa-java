package dev.tombolton.dsa.quicksort.exercises.findgreatestnumber;

import java.util.Arrays;

public class FindGreatestNumber {
    // O(N^2)
    public static int quadraticTime(int[] array) {
        int max = array[0];
        boolean iIsGreatestNumber;

        for (int i : array) {
            iIsGreatestNumber = true;

            for (int j : array) {
                if (j > i) {
                    iIsGreatestNumber = false;
                }
            }

            if (iIsGreatestNumber) {
                max = i;
            }
        }

        return max;
    }

    // O(N log N)
    public static int linearithmicTime(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    // O(N)
    public static int linearTime(int[] array) {
        int max = array[0];

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}
