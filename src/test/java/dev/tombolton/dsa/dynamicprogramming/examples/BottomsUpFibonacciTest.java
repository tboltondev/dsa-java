package dev.tombolton.dsa.dynamicprogramming.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BottomsUpFibonacciTest {
    @Test
    public void shouldReturnFibonacciNumberAtN() {
        // Arrange
        int n = 10;

        // Act
        int result = BottomsUpFibonacci.valueAt(n);

        // Assert
        assertEquals(55, result);;
    }
}
