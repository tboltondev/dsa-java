package dev.tombolton.dsa.dynamicprogramming.examples;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void shouldReturnFibonacciNumberAtN() {
        // Arrange
        Integer n = 10;
        HashMap<Integer, Integer> memo = new HashMap<>();

        // Act
        Integer result = Fibonacci.valueAt(n, memo);

        // Assert
        assertEquals(55, result);;
        assertEquals(9, memo.keySet().size());
    }
}
