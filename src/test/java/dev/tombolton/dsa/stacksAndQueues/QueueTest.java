package dev.tombolton.dsa.stacksAndQueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class QueueTest {
    @Test
    public void shouldAddAndRemoveElementsFromQueue() {
        // Arrange
        Queue<Integer> integerQueue = new Queue<>();

        // Act
        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);

        // Assert
        assertEquals(integerQueue.dequeue(), 1);
        assertEquals(integerQueue.dequeue(), 2);
        assertEquals(integerQueue.dequeue(), 3);
        assertNull(integerQueue.read());
    }

    @Test
    public void shouldReadTheFirstElement() {
        // Arrange
        Queue<String> stringQueue = new Queue<>();

        // Act
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("World");
        stringQueue.enqueue("From");
        stringQueue.enqueue("My Queue");

        // Assert
        assertEquals(stringQueue.read(), "Hello");

        stringQueue.dequeue();
        stringQueue.dequeue();
        assertEquals(stringQueue.read(), "From");
    }
}
