package dev.tombolton.dsa.linkedlists.exercises.removenode;

import dev.tombolton.dsa.linkedlists.examples.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveNodeFromLinkedListTest {
    @Test
    public void shouldRemoveNodeFromUnknownLinkedList() {
        // Arrange
        LinkedList<Integer> list = new LinkedList<>(100, 90, 70, 40, 0);

        // Act
        RemoveNodeFromLinkedList.remove(list.read(2));

        // Assert
        assertEquals("100, 90, 40, 0", list.toString());
    }
}
