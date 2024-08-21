package dev.tombolton.dsa.stacksAndQueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {
    @Test
    public void shouldPushAndPopElementsOnTheStack() {
        // Arrange
        Stack<Integer> integerStack = new Stack<>();

        // Act
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        // Assert
        assertEquals(integerStack.pop(), 3);
        assertEquals(integerStack.pop(), 2);
        assertEquals(integerStack.pop(), 1);
        assertTrue(integerStack.isEmpty());
    }

    @Test
    public void shouldReadTheLastElement() {
        // Arrange
        Stack<String> stringStack = new Stack<>();

        // Act
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("From");
        stringStack.push("My Stack");

        // Assert
        assertEquals(stringStack.read(), "My Stack");

        stringStack.pop();
        stringStack.pop();
        assertEquals(stringStack.read(), "World");
    }

    @Test
    public void shouldClearTheStack() {
        // Arrange
        Stack<Boolean> booleanStack = new Stack<>();

        // Act
        booleanStack.push(true);
        booleanStack.push(false);
        booleanStack.push(false);
        booleanStack.push(true);
        booleanStack.clear();

        // Assert
        assertTrue(booleanStack.isEmpty());
    }
}
