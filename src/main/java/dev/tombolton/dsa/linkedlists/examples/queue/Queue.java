package dev.tombolton.dsa.linkedlists.examples.queue;

import dev.tombolton.dsa.linkedlists.examples.doublylinkedlist.DoublyLinkedList;

public class Queue<T> {
    private final DoublyLinkedList<T> data = new DoublyLinkedList<>();

    public void enqueue(T element) {
        this.data.insertAtEnd(element);
    }

    public T dequeue() {
        return this.data.removeFromFront();
    }

    public T read() {
        if (this.data.firstNode == null) {
            return null;
        }
        return this.data.firstNode.data;
    }
}
