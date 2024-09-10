package dev.tombolton.dsa.linkedlists.examples.linkedlist;

public class LinkedList<T> {
    public Node<T> firstNode;

    @SafeVarargs
    public LinkedList(T... values) {
        firstNode = new Node<>(values[0]);
        Node<T> currentNode = new Node<>(values[1]);

        firstNode.nextNode = currentNode;

        for (int i = 2; i < values.length; i++) {
           Node<T> nextNode = new Node<>(values[i]);
           currentNode.nextNode = nextNode;
           currentNode = nextNode;
        }
    }

    public T read(int index) {
        Node<T> currentNode = firstNode;
        int currentIndex = 0;

        while (currentIndex < index) {
            currentNode = currentNode.nextNode;
            currentIndex += 1;
            if (currentNode == null) return null;
        }

        return currentNode.data;
    }

    public Integer search(T value) {
        Node<T> currentNode = firstNode;
        int currentIndex = 0;

        while (currentNode != null) {
            if (currentNode.data == value) {
                return currentIndex;
            }

            currentNode = currentNode.nextNode;
            currentIndex += 1;
        }

        return null;
    }

    public void insert(int index, T value) {
        Node<T> newNode = new Node<>(value);

        if (index == 0) {
            newNode.nextNode = firstNode;
            firstNode = newNode;
            return;
        }

        Node<T> currentNode = firstNode;
        int currentIndex = 0;

        while (currentIndex < (index - 1)) {
            currentNode = currentNode.nextNode;
            currentIndex += 1;
        }

        newNode.nextNode = currentNode.nextNode;
        currentNode.nextNode = newNode;
    }

    public void delete(int index) {
        if (index == 0) {
            firstNode = firstNode.nextNode;
            return;
        }

        Node<T> currentNode = firstNode;
        int currentIndex = 0;

        while (currentIndex < (index - 1)) {
            currentNode = currentNode.nextNode;
            currentIndex += 1;
        }

        Node<T> deleteNode = currentNode.nextNode;
        currentNode.nextNode = deleteNode.nextNode;
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
