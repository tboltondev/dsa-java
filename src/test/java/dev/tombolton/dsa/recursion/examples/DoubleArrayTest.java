package dev.tombolton.dsa.recursion.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DoubleArrayTest {
    @Test
    public void shouldDoubleIntegersInArray() {
        // Arrange
        int[] arr = {1, 2, 3, 4, 5};

        // Act
        DoubleArray.doubleArray(arr);

        // Assert
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, arr);
    }
}
