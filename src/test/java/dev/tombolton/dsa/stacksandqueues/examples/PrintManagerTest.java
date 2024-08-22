package dev.tombolton.dsa.stacksandqueues.examples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintManagerTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void beforeEach() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void afterEach() {
        System.setOut(standardOut);
    }

    @Test
    public void shouldQueueAndPrintAllJobs() {
        // Arrange
        PrintManager printManager = new PrintManager();
        printManager.queuePrintJob("First Document");
        printManager.queuePrintJob("Second Document");
        printManager.queuePrintJob("Third Document");

        // Act
        printManager.run();

        // Assert
        assertEquals("First Document\nSecond Document\nThird Document\n", outputStreamCaptor.toString());
    }
}
