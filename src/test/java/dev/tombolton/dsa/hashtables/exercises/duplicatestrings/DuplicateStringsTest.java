package dev.tombolton.dsa.hashtables.exercises.duplicatestrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuplicateStringsTest {
    @Test
    public void shouldReturnDuplicate() {
        // Arrange
        String[] strings = {"a", "b", "c", "d", "c", "e", "f"};

        // Act
        String result = DuplicateStrings.findDuplicate(strings);

        // Assert
        Assertions.assertEquals("c", result);
    }

    @Test
    public void shouldReturnOnlyFirstDuplicate() {
        // Arrange
        String[] strings = {"one", "two", "three", "four", "three", "four", "five", "six"};

        // Act
        String result = DuplicateStrings.findDuplicate(strings);

        // Assert
        Assertions.assertEquals("three", result);
    }

    @Test
    public void shouldReturnNullIfNoDuplicate() {
        // Arrange
        String[] strings = {"a", "b", "c", "d", "e", "f"};

        // Act
        String result = DuplicateStrings.findDuplicate(strings);

        // Assert
        Assertions.assertNull(result);
    }
}
