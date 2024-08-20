package dev.tombolton.dsa.hashTables.exercises.arrayIntersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayIntersection {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        for (int value : arr1) {
            hashMap.put(value, true);
        }

        for (int value : arr2) {
            if (hashMap.containsKey(value)) {
                intersection.add(value);
            }
        }

        return intersection;
    }
}
