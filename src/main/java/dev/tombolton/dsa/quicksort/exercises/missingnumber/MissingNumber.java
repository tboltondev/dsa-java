package dev.tombolton.dsa.quicksort.exercises.missingnumber;

import java.util.Collections;
import java.util.List;

public class MissingNumber {
    public static Integer findMissingNumber(List<Integer> array) {
        Collections.sort(array);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                return i;
            }
        }

        return null;
    }
}
