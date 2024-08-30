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

    @Test
    public void shouldReturnCorrectCount_scenario4() {
        // Arrange
        int stairs = 1;

        // Act
        int result = StaircaseProblem.count(stairs);

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void shouldReturnCorrectCount_scenario5() {
        // Arrange
        int stairs = 2;

        // Act
        int result = StaircaseProblem.count(stairs);

        // Assert
        assertEquals(2, result);
    }

    @Test
    public void shouldReturnCorrectCount_scenario6() {
        // Arrange
        int stairs = 3;

        // Act
        int result = StaircaseProblem.count(stairs);

        // Assert
        assertEquals(4, result);
    }
}
