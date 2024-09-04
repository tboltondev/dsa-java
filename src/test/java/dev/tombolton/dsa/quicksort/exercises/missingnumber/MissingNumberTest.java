package dev.tombolton.dsa.quicksort.exercises.missingnumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    @Test
    public void shouldReturnMissingNumber() {
        // Arrange
        List<Integer> array = Arrays.asList(9, 3, 2, 5, 6, 7, 1, 0, 4);

        // Act
        Integer result = MissingNumber.findMissingNumber(array);

        // Assert
        assertEquals(8, result);
    }
}
