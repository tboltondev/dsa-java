package dev.tombolton.dsa.stacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> data = new ArrayList<>();

    public void push(T element) {
        this.data.addLast(element);
    }

    public T pop() {
        return this.data.removeLast();
    }

    public T read() {
        return this.data.getLast();
    }

    public Boolean isEmpty() {
        return this.data.isEmpty();
    }

    public void clear() {
        this.data.clear();
    }
}
