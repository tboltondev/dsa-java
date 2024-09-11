package dev.tombolton.dsa.linkedlists.exercises.reverse;

import dev.tombolton.dsa.linkedlists.examples.linkedlist.LinkedList;
import dev.tombolton.dsa.linkedlists.examples.linkedlist.Node;

public class Q4LinkedList<T> extends LinkedList<T> {
    @SafeVarargs
    public Q4LinkedList(T... values) {
        super(values);
    }

    public void reverse() {
        Node<T> currentNode = firstNode.nextNode;
        firstNode.nextNode = null;

        while (currentNode != null) {
            Node<T> previousFirstNode = firstNode;
            Node<T> nodeAfter = currentNode.nextNode;

            firstNode = currentNode;
            firstNode.nextNode = previousFirstNode;

            currentNode = nodeAfter;
        }
    }
}
