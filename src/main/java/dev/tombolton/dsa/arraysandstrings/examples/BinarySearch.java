package dev.tombolton.dsa.arraysandstrings.examples;

public class BinarySearch {
    public static int search(int[] arr, int value) {
        int lowerBound = 0;
        int upperBound = arr.length - 1;

        while (lowerBound <= upperBound) {
            int midpoint = (upperBound + lowerBound) / 2;

            int valueAtMidpoint = arr[midpoint];

            if (value == valueAtMidpoint) {
                return midpoint;
            }

            if (value < valueAtMidpoint) {
                upperBound = midpoint - 1;
            } else {
                lowerBound = midpoint + 1;
            }
        }

        return -1;
    }
}
