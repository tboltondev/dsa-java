package dev.tombolton.dsa.recursion.exercises.uniquepaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsTest {
    @Test
    public void shouldReturnNumberOfShortestPaths7x3() {
        // Arrange
        int rows = 7;
        int columns = 3;

        // Act
        int result = UniquePaths.countUniquePaths(rows, columns);

        // Assert
        assertEquals(28, result);
    }

    @Test
    public void shouldReturnNumberOfShortestPaths6x8() {
        // Arrange
        int rows = 6;
        int columns = 8;

        // Act
        int result = UniquePaths.countUniquePaths(rows, columns);

        // Assert
        assertEquals(792, result);
    }
}
