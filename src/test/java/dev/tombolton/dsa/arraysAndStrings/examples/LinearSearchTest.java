package dev.tombolton.dsa.arraysAndStrings.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {
    @Test
    public void shouldReturnCorrectIndex() {
        // Arrange
        int[] arr = {10, 6, 3, 2};

        // Act
        int result = LinearSearch.search(arr, 3);

        // Assert
        assertEquals(2, result);
    }

    @Test
    public void shouldReturnCorrectIndexForFirstMatch() {
        // Arrange
        int[] arr = {6, 4, 2, 0, 5, 9, 10, 5};

        // Act
        int result = LinearSearch.search(arr, 5);

        // Assert
        assertEquals(4, result);
    }

    @Test
    public void shouldReturnNegativeOneForNoMatch() {
        // Arrange
        int[] arr = {1, 2, 3, 4};

        // Act
        int result = LinearSearch.search(arr, 5);

        // Assert
        assertEquals(-1, result);
    }
}
