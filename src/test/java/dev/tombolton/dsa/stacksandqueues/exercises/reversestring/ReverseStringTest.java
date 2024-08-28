package dev.tombolton.dsa.stacksandqueues.exercises.reversestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    @Test
    public void shouldReverseString() {
        // Arrange
        String input = "abcde";

        // Act
        String result = ReverseString.reverse(input);

        // Assert
        assertEquals("edcba", result);
    }

    @Test
    public void shouldReverseStringWithCapitalsAndSpaces() {
        // Arrange
        String input = "!gnirtS DESREVER olleH";

        // Act
        String result = ReverseString.reverse(input);

        // Assert
        assertEquals("Hello REVERSED String!", result);
    }
}
