package dev.tombolton.dsa.quicksort.examples;

public class DuplicateValues {
    public static boolean hasDuplicate(SortableArray sortable) {
        sortable.quicksort();

        for (int i = 0; i < sortable.array.length - 1; i++) {
            if (sortable.array[i] == sortable.array[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
