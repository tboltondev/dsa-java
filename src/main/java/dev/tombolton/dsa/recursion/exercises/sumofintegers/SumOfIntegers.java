package dev.tombolton.dsa.recursion.exercises.sumofintegers;

public class SumOfIntegers {
    public static int sum(int low, int high) {
        if (low > high) {
            return 0;
        }
        return high + sum(low, high - 1);
    }
}
