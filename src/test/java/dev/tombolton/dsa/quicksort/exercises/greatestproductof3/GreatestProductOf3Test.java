package dev.tombolton.dsa.quicksort.exercises.greatestproductof3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestProductOf3Test {
    @Test
    public void shouldReturnGreatestProductOf3() {
        // Arrange
        int[] numbers = {24, 32, 65, 7, 16};

        // Act
        int result = GreatestProductOf3.product(numbers);

        // Assert
        assertEquals(49_920, result);
    }
}
