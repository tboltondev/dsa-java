package dev.tombolton.dsa.stacksandqueues;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue<T> {
    private final List<T> data = new ArrayList<>();

    public void enqueue(T element) {
        this.data.add(element);
    }

    public T dequeue() {
        return this.data.removeFirst();
    }

    public T read() {
        try {
            return this.data.getFirst();
        } catch (Exception e) {
            if (e instanceof NoSuchElementException) {
                return null;
            }
            throw e;
        }
    }
}
