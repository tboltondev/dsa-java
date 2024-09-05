package dev.tombolton.dsa.quicksort.exercises.findgreatestnumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FIndGreatestNumberTest {
    @Test
    @DisplayName("should find greatest number in O(N^2) time")
    public void shouldReturnGreatestNumberInQuadraticTime() {
        // Arrange
        int[] array = {0, 6, 9, 2, 8, 7};

        // Act
        int result = FindGreatestNumber.quadraticTime(array);

        // Assert
        assertEquals(9, result);
    }

    @Test
    @DisplayName("should find greatest number in O(N log N) time")
    public void shouldReturnGreatestNumberInLinearithmicTime() {
        // Arrange
        int[] array = {0, 6, 9, 2, 8, 7};

        // Act
        int result = FindGreatestNumber.linearithmicTime(array);

        // Assert
        assertEquals(9, result);
    }

    @Test
    @DisplayName("should find greatest number in O(N) time")
    public void shouldReturnGreatestNumberInLinearTime() {
        // Arrange
        int[] array = {0, 6, 9, 2, 8, 7};

        // Act
        int result = FindGreatestNumber.linearTime(array);

        // Assert
        assertEquals(9, result);
    }
}
