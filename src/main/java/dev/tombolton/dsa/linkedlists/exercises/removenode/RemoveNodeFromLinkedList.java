package dev.tombolton.dsa.linkedlists.exercises.removenode;

import dev.tombolton.dsa.linkedlists.examples.linkedlist.Node;

public class RemoveNodeFromLinkedList {
    public static <T> void remove(Node<T> node) {
        node.data = node.nextNode.data;
        node.nextNode = node.nextNode.nextNode;
    }
}
