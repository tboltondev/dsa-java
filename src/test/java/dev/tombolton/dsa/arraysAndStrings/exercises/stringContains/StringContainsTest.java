package dev.tombolton.dsa.arraysAndStrings.exercises.stringContains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringContainsTest {
    @Test
    public void shouldReturnTrueIfStringContainsX() {
        // Arrange
        String str = "A string that contains X";

        // Act
        boolean result = StringContains.containsX(str);

        // Assert
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfDoesntContainX() {
        // Arrange
        String str = "A string that doesn't";

        // Act
        boolean result = StringContains.containsX(str);

        // Assert
        Assertions.assertFalse(result);
    }
}
