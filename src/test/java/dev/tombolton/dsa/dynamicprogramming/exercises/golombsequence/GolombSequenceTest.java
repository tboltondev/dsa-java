package dev.tombolton.dsa.dynamicprogramming.exercises.golombsequence;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GolombSequenceTest {
    @Test
    @DisplayName("should return correct term of Golomb sequence given n")
    public void shouldReturnCorrectTerm() {
        // Arrange
        int n = 20;

        // Act
        int result = GolombSequence.valueAt(n);

        // Assert
        assertEquals(8, result);
    }
}
