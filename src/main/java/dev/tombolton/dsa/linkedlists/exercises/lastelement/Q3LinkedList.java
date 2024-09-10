package dev.tombolton.dsa.linkedlists.exercises.lastelement;

import dev.tombolton.dsa.linkedlists.examples.linkedlist.LinkedList;
import dev.tombolton.dsa.linkedlists.examples.linkedlist.Node;

public class Q3LinkedList<T> extends LinkedList<T> {
    @SafeVarargs
    public Q3LinkedList(T... values) {
        super(values);
    }

    public T getLast() {
        Node<T> currentNode = firstNode;

        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }

        return currentNode.data;
    }
}
