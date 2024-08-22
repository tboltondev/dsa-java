package dev.tombolton.dsa.arraysandstrings.exercises.greatestNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreatestNumberTest {
    @Test
    public void shouldReturnGreatestNumberInArray() {
        // Arrange
        int[] arr = {1, 5, 17, -6, 0};

        // Act
        int result = GreatestNumber.greatestNumber(arr);

        // Assert
        Assertions.assertEquals(17, result);
    }
}
