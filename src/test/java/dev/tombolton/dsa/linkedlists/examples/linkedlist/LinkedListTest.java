package dev.tombolton.dsa.linkedlists.examples.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    @Test
    public void shouldCreateLinkedList() {
        // Arrange
        // Act
        LinkedList<String> list = new LinkedList<>("Once", "upon", "a", "time");

        // Assert
        assertEquals("Once, upon, a, time", list.toString());
    }

    @Test
    public void shouldReadCorrectValueByIndex() {
        // Arrange
        LinkedList<String> list = new LinkedList<>("Once", "upon", "a", "time");

        // Act
        Node<String> result = list.read(3);

        // Assert
        assertEquals("time", result.data);
    }

    @Test
    public void searchShouldReturnCorrectIndexOfValue() {
        // Arrange
        LinkedList<String> list = new LinkedList<>("Once", "upon", "a", "time");

        // Act
        Integer result = list.search("time");

        // Assert
        assertEquals(3, result);
    }

    @Test
    public void shouldInsertAtCorrectIndex() {
        // Arrange
        LinkedList<String> list = new LinkedList<>("yellow", "blue", "green", "red");

        // Act
        list.insert(2, "purple");

        // Assert
        assertEquals("yellow, blue, purple, green, red", list.toString());
    }

    @Test
    public void shouldDeleteANodeByIndex() {
        // Arrange
        LinkedList<String> list = new LinkedList<>("yellow", "blue", "green", "red");

        // Act
        list.delete(2);

        // Assert
        assertEquals("yellow, blue, red", list.toString());
    }
}
