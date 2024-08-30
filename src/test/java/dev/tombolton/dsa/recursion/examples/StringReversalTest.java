package dev.tombolton.dsa.recursion.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReversalTest {
    @Test
    public void shouldReverseString() {
        // Arrange
        String string = "abcde";

        // Act
        String result = StringReversal.reverse(string);

        // Assert
        assertEquals("edcba", result);
    }
}
