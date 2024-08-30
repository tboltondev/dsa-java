package dev.tombolton.dsa.recursion.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaircaseProblemTest {
    @Test
    public void shouldReturnCorrectCount_scenario1() {
        // Arrange
        int stairs = 4;

        // Act
        int result = StaircaseProblem.count(stairs);

        // Assert
        assertEquals(7, result);
    }


    @Test
    public void shouldReturnCorrectCount_scenario2() {
        // Arrange
        int stairs = 5;

        // Act
        int result = StaircaseProblem.count(stairs);

        // Assert
        assertEquals(13, result);
    }

    @Test
    public void shouldReturnCorrectCount_scenario3() {
        // Arrange
        int stairs = 11;

        // Act
        int result = StaircaseProblem.count(stairs);

        // Assert
        assertEquals(504, result);
    }
}
