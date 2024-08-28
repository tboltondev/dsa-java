package dev.tombolton.dsa.hashtables.exercises.missingletter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingLetterTest {
    @Test
    public void shouldReturnMissingLetter() {
        // Arrange
        String testString = "the quick brown box jumps over a lazy dog";

        // Act
        Character result = MissingLetter.findMissingLetter(testString);

        // Assert
        Assertions.assertEquals('f', result);
    }

    @Test
    public void shouldReturnMissingLetterWithUppercaseLetters() {
        // Arrange
        String testString = "the Quick brown Box JUMPS over a lazy dog";

        // Act
        Character result = MissingLetter.findMissingLetter(testString);

        // Assert
        Assertions.assertEquals('f', result);
    }

    @Test
    public void shouldReturnNullIfNoMissingLetter() {
        // Arrange
        String testString = "the quick brown fox jumps over a lazy dog";

        // Act
        Character result = MissingLetter.findMissingLetter(testString);

        // Assert
        Assertions.assertNull(result);
    }

    @Test
    public void shouldReturnNullIfNoMissingLetterAndContainsUppercase() {
        // Arrange
        String testString = "the quick brown FOX jumps over a lazy dog";

        // Act
        Character result = MissingLetter.findMissingLetter(testString);

        // Assert
        Assertions.assertNull(result);
    }
}
