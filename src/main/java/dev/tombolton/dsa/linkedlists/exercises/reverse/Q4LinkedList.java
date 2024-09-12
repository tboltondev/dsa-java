package dev.tombolton.dsa.linkedlists.exercises.reverse;

import dev.tombolton.dsa.linkedlists.examples.linkedlist.LinkedList;
import dev.tombolton.dsa.linkedlists.examples.linkedlist.Node;

public class Q4LinkedList<T> extends LinkedList<T> {
    @SafeVarargs
    public Q4LinkedList(T... values) {
        super(values);
    }

    public void reverse() {
        Node<T> previousNode = null;
        Node<T> currentNode = firstNode;

        while (currentNode != null) {
            Node<T> nextNode = currentNode.nextNode;

            currentNode.nextNode = previousNode;

            previousNode = currentNode;
            currentNode = nextNode;
        }

        firstNode = previousNode;
    }
}
