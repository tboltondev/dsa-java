package dev.tombolton.dsa.linkedlists.examples;

public class Node<T> {
    public T data;
    public Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }
}
