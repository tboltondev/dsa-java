package dev.tombolton.dsa.recursion.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumTest {
    @Test
    public void shouldSumIntArray() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};

        // Act
        int result = ArraySum.sum(array);

        // Assert
        assertEquals(15, result);
    }
}
