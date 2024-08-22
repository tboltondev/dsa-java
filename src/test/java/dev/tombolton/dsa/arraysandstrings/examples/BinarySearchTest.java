package dev.tombolton.dsa.arraysandstrings.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    public void shouldReturnCorrectIndexOfSearchValInSortedArray() {
        // Arrange
        int[] arr = {3, 4, 5, 6, 7};

        // Act
        int result = BinarySearch.search(arr, 4);

        // Assert
        Assertions.assertEquals(1, result);
    }

    @Test
    public void shouldReturnNegativeOneForNoMatch() {
        // Arrange
        int[] arr = {1, 2, 3, 4};

        // Act
        int result = LinearSearch.search(arr, 5);

        // Assert
        Assertions.assertEquals(-1, result);
    }
}
