package dev.tombolton.dsa.hashTables.exercises.duplicateChars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuplicateCharsTest {
    @Test
    public void shouldReturnDuplicate() {
        // Arrange
        Character[] chars = {'a', 'b', 'c', 'd', 'c', 'e', 'f'};

        // Act
        Character result = DuplicateChars.findDuplicate(chars);

        // Assert
        Assertions.assertEquals('c', result);
    }

    @Test
    public void shouldReturnOnlyFirstDuplicate() {
        // Arrange
        Character[] chars = {'a', 'b', 'c', 'd', 'c', 'd', 'e', 'f'};

        // Act
        Character result = DuplicateChars.findDuplicate(chars);

        // Assert
        Assertions.assertEquals('c', result);
    }

    @Test
    public void shouldReturnNullIfNoDuplicate() {
        // Arrange
        Character[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};

        // Act
        Character result = DuplicateChars.findDuplicate(chars);

        // Assert
        Assertions.assertNull(result);
    }
}
