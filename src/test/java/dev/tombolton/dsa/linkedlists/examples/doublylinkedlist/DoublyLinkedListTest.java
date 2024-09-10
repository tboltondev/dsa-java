package dev.tombolton.dsa.linkedlists.examples.doublylinkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DoublyLinkedListTest {
    @Test
    public void shouldCreateDoublyLinkedList() {
        // Arrange
        // Act
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>(1000, 1001, 1002, 1003);

        // Assert
        assertEquals("1000, 1001, 1002, 1003", doublyLinkedList.toString());
    }

    @Test
    public void shouldCreateDoublyLinkedListWithOneItem() {
        // Arrange
        // Act
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>(1000);

        // Assert
        assertEquals("1000", doublyLinkedList.toString());
        assertEquals(doublyLinkedList.firstNode, doublyLinkedList.lastNode);
    }

    @Test
    public void shouldInsertItemAtEnd() {
        // Arrange
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>(1000, 1001, 1002, 1003);

        // Act
        doublyLinkedList.insertAtEnd(1004);

        // Assert
        assertEquals(1004, doublyLinkedList.lastNode.data);
    }

    @Test
    public void shouldInsertItemAtEndOfEmptyList() {
        // Arrange
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

        // Act
        doublyLinkedList.insertAtEnd(1004);

        // Assert
        assertEquals(1004, doublyLinkedList.firstNode.data);
        assertEquals(1004, doublyLinkedList.lastNode.data);
    }

    @Test
    public void shouldRemoveFirstItem() {
        // Arrange
        DoublyLinkedList<String> list = new DoublyLinkedList<>("Abu Bakr", "Umar", "Uthman", "Ali");

        // Act
        String result = list.removeFromFront();

        // Assert
        assertEquals("Abu Bakr", result);
        assertEquals("Umar, Uthman, Ali", list.toString());
    }

    @Test
    @DisplayName("removeFromFront should return null if list is empty")
    public void shouldReturnNullIfListEmpty() {
        // Arrange
        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        // Act
        String result = list.removeFromFront();

        // Assert
        assertNull(result);
        assertNull(list.toString());
    }
}
