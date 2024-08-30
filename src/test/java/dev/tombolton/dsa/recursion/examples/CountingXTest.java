package dev.tombolton.dsa.recursion.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingXTest {
    @Test
    public void shouldCountXsInString() {
        // Arrange
        String string = "xbXcxDx";

        // Act
        int result = CountingX.count(string);

        // Assert
        assertEquals(4, result);
    }
}
