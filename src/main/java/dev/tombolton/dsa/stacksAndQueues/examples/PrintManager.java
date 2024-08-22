package dev.tombolton.dsa.stacksAndQueues.examples;

import dev.tombolton.dsa.stacksAndQueues.Queue;

public class PrintManager {
    private final Queue<String> printQueue = new Queue<>();

    public void queuePrintJob(String document) {
        this.printQueue.enqueue(document);
    }

    public void run() {
        while (this.printQueue.read() != null) {
            this.print(this.printQueue.dequeue());
        }
    }

    private void print(String document) {
        System.out.println(document);
    }
}
