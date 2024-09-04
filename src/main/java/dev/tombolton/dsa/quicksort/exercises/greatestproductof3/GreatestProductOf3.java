package dev.tombolton.dsa.quicksort.exercises.greatestproductof3;

import java.util.Arrays;

public class GreatestProductOf3 {
    public static int product(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2] * numbers[numbers.length - 3];
    }
}
