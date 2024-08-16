package dev.tombolton.dsa.arraysAndStrings.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {
    @Test
    public void testLinearSearch() {
        // Arrange
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Act
        int result = LinearSearch.search(arr, 5);

        // Assert
        assertEquals(result, 4);
    }
}
