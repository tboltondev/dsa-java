package dev.tombolton.dsa.recursion.examples;

public class StaircaseProblem {
    public static int count(int stairs) {
        if (stairs == 0) return 0;
        if (stairs == 1) return 1;
        if (stairs == 2) return 2;
        if (stairs == 3) return 4;

        return count(stairs - 1) + count(stairs - 2) + count(stairs - 3);
    }
}
