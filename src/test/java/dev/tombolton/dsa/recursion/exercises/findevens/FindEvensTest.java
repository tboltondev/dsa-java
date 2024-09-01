package dev.tombolton.dsa.recursion.exercises.findevens;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class FindEvensTest {
    @Test
    public void shouldReturnOnlyEvens() {
        // Arrange
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        // Act
        List<Integer> result = FindEvens.find(numbers);

        // Assert
        assertIterableEquals(List.of(2, 4, 6), result);
    }
}
