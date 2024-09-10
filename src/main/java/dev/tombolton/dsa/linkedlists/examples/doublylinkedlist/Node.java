package dev.tombolton.dsa.linkedlists.examples.doublylinkedlist;

public class Node<T> {
    public T data;
    public Node<T> nextNode;
    public Node<T> previousNode;

    public Node(T data) {
        this.data = data;
    }
}
