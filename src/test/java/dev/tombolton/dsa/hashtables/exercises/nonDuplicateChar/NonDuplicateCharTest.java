package dev.tombolton.dsa.hashtables.exercises.nonDuplicateChar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonDuplicateCharTest {
    @Test
    public void shouldReturnFirstNonDuplicate() {
        // Arrange
        String testString = "minimum";

        // Act
        Character result = NonDuplicateChar.findFirstNonDuplicate(testString);

        // Assert
        Assertions.assertEquals('n', result);
    }

    @Test
    public void shouldReturnFirstNonDuplicateIfContainsUppercase() {
        // Arrange
        String testString = "This STRING contains UPPERCASE letters";

        // Act
        Character result = NonDuplicateChar.findFirstNonDuplicate(testString);

        // Assert
        Assertions.assertEquals('h', result);
    }

    @Test
    public void shouldReturnNullIfNoNonDuplicates() {
        // Arrange
        String testString = "Hello world hello World";

        // Act
        Character result = NonDuplicateChar.findFirstNonDuplicate(testString);

        // Assert
        Assertions.assertNull( result);
    }
}
