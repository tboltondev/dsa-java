package dev.tombolton.dsa.stacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private final List<T> data = new ArrayList<>();

    public void enqueue(T element) {
        this.data.add(element);
    }

    public T dequeue() {
        return this.data.removeFirst();
    }

    public T read() {
        return this.data.getFirst();
    }
}
