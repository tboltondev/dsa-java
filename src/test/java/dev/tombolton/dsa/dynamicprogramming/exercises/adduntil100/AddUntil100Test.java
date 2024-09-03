package dev.tombolton.dsa.dynamicprogramming.exercises.adduntil100;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddUntil100Test {
    @Test
    @DisplayName("should add numbers up to a maximum total of 100")
    public void shouldAddNumbersUpTo100() {
        // Arrange
        int[] numbers = {3, 4, 5, 10, 80};

        // Act
        int result = AddUntil100.add(numbers);

        // Assert
        assertEquals(99, result);
    }
}
