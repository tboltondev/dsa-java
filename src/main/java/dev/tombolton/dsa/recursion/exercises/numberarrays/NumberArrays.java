package dev.tombolton.dsa.recursion.exercises.numberarrays;

public class NumberArrays {
    public static void print(IntOrArr[] array) {
        for (IntOrArr element : array) {
            if (element.isArray()) {
                print(element.getArray());
            } else {
                System.out.println(element.getInteger());
            }
        }
    }
}
