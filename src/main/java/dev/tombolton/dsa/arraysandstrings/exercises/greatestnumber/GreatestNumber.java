package dev.tombolton.dsa.arraysandstrings.exercises.greatestnumber;

class GreatestNumber {
    public static int greatestNumber(int[] arr) {
        int greatestValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > greatestValue) {
                greatestValue = arr[i];
            }
        }

        return greatestValue;
    }
}
