package dev.tombolton.dsa.recursion.exercises.findx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindXTest {
    @Test
    public void shouldReturnIndexOfX() {
        // Arrange
        String string = "abcdefghijklmnopqrstuvwxyz";

        // Act
        int result = FindX.find(string);

        // Assert
        assertEquals(23, result);
    }
}
