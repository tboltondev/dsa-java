package dev.tombolton.dsa.linkedlists.exercises.lastelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q3LinkedListTest {
    @Test
    public void shouldReturnLastElementOfList() {
        // Arrange
        Q3LinkedList<Integer> list = new Q3LinkedList<>(12, 24, 36, 48);

        // Act
        Integer result = list.getLast();

        // Assert
        assertEquals(48, result);
    }
}
