package dev.tombolton.dsa.arraysandstrings.examples;

public class InsertionSort {
    public static int[] sort(int[] arr) {
        int current;
        int testIndex;

        for (int i = 1; i < arr.length; i++) {
            current = arr[i];
            testIndex = i - 1;

            while (testIndex >= 0 && arr[testIndex] > current) {
                arr[testIndex + 1] = arr[testIndex];
                testIndex -= 1;
            }

            arr[testIndex + 1] = current;
        }

        return arr;
    }
}
