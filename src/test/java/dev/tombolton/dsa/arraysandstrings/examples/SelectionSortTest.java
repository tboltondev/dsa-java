package dev.tombolton.dsa.arraysandstrings.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {
    @Test
    public void shouldSortIntegerArray() {
        // Arrange
        int[] arr = {10, 3, 2, 26, -4, 0};

        // Act
        int[] result = SelectionSort.sort(arr);

        // Assert
        Assertions.assertArrayEquals(new int[]{-4, 0, 2, 3, 10, 26}, result);
    }
}
