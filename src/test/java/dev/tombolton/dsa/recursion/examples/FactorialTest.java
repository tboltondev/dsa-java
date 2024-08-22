package dev.tombolton.dsa.recursion.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void shouldReturnFactorial() {
        // Arrange
        int number = 12;

        // Act
        int result = Factorial.factorial(number);

        // Assert
        assertEquals(479_001_600, result);
    }
}
