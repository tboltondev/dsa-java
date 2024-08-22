package dev.tombolton.dsa.hashtables.examples;

import java.util.HashMap;

public class ArraySubset {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        int[] largerArray;
        int[] smallerArray;
        HashMap<Integer, Boolean> hashTable = new HashMap<>();

        if (arr1.length > arr2.length) {
            largerArray = arr1;
            smallerArray = arr2;
        } else {
            largerArray = arr2;
            smallerArray = arr1;
        }

        for (int value : largerArray) {
            hashTable.put(value, true);
        }

        for (int value : smallerArray) {
            if (hashTable.get(value) == null) {
                return false;
            }
        }

        return true;
    }
}
