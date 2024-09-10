package dev.tombolton.dsa.linkedlists.examples.doublylinkedlist;

public class DoublyLinkedList<T> {
    public Node<T> firstNode;
    public Node<T> lastNode;

    public DoublyLinkedList() {}

    @SafeVarargs
    public DoublyLinkedList(T... values) {
        firstNode = new Node<>(values[0]);

        if (values.length == 1) {
            lastNode = firstNode;
            return;
        }

        Node<T> currentNode = new Node<>(values[1]);

        firstNode.nextNode = currentNode;
        currentNode.previousNode = firstNode;

        for (int i = 2; i < values.length - 1; i++) {
            Node<T> nextNode = new Node<>(values[i]);
            currentNode.nextNode = nextNode;
            nextNode.previousNode = currentNode;
            currentNode = nextNode;
        }

        lastNode = new Node<>(values[values.length - 1]);
        currentNode.nextNode = lastNode;
        lastNode.previousNode = currentNode;
    }

    public void insertAtEnd(T value) {
        Node<T> newNode = new Node<>(value);

        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            newNode.previousNode = lastNode;
            lastNode.nextNode = newNode;
            lastNode = newNode;
        }
    }

    public T removeFromFront() {
        if (firstNode == null) return null;
        Node<T> removedNode = firstNode;
        firstNode = firstNode.nextNode;
        firstNode.previousNode = null;
        return removedNode.data;
    }

    public String toString() {
        if (firstNode == null) return null;
        if (firstNode.nextNode == null) return firstNode.data.toString();
        return firstNode.data.toString() + ", " + toString(firstNode.nextNode);
    }

    private String toString(Node<T> node) {
        if (node.nextNode == null) {
            return node.data.toString();
        }

        return node.data.toString() + ", " + toString(node.nextNode);
    }
}
