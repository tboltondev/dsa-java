package dev.tombolton.dsa.recursion.exercises.charactercount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterCountTest {
    @Test
    public void shouldCountCharacters() {
        // Arrange
        String[] strings = {"hello", "World", "ab", "c", "def", "ghij"};

        // Act
        int count = CharacterCount.count(strings);

        // Assert
        assertEquals(20, count);
    }
}
