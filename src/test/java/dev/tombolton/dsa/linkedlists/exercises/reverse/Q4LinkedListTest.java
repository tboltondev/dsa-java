package dev.tombolton.dsa.linkedlists.exercises.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q4LinkedListTest {
    @Test
    public void shouldReverseLinkedList() {
        // Arrange
        Q4LinkedList<Character> list = new Q4LinkedList<>('A', 'B', 'C', 'D');

        // Act
        list.reverse();

        // Assert
        assertEquals("D, C, B, A", list.toString());
        assertEquals('D', list.firstNode.data);
        assertEquals('C', list.read(1));
        assertEquals('B', list.read(2));
        assertEquals('A', list.read(3));
    }
}
