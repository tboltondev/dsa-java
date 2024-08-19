package dev.tombolton.dsa.arraysAndStrings.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {
    @Test
    public void shouldSortIntegerArray() {
        // Arrange
        int[] arr = {10, 3, 2, 26, -4, 0};

        // Act
        int[] result = SelectionSort.sort(arr);

        // Assert
        assertArrayEquals(new int[]{-4, 0, 2, 3, 10, 26}, result);
    }
}
