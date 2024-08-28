package dev.tombolton.dsa.recursion.examples;

public class DoubleArray {
    public static void doubleArray(int[] arr) {
       arr[0] *= 2;
       doubleArray(arr, 1);
    }

    public static void doubleArray(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }

        arr[index] *= 2;
        doubleArray(arr, index + 1);
    }
}
