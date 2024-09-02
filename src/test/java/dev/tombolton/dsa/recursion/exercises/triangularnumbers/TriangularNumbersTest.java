package dev.tombolton.dsa.recursion.exercises.triangularnumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangularNumbersTest {
    @Test
    public void shouldReturnCorrectNumberForNEqual7() {
        // Arrange
        int n = 7;

        // Act
        int result = TriangularNumbers.calculate(n);

        // Assert
        assertEquals(28, result);
    }

    @Test
    public void shouldReturnCorrectNumberForNEqual22() {
        // Arrange
        int n = 22;

        // Act
        int result = TriangularNumbers.calculate(n);

        // Assert
        assertEquals(253, result);
    }
}
