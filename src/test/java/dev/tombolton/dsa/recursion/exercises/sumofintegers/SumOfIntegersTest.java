package dev.tombolton.dsa.recursion.exercises.sumofintegers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfIntegersTest {
    @Test
    public void shouldSumIntegersBetweenLowAndHigh() {
        // Arrange
        int low = 1;
        int high = 10;

        // Act
        int result = SumOfIntegers.sum(low, high);

        // Assert
        assertEquals(55, result);
    }

    @Test
    public void shouldReturnSumBeginningFromAnyInteger() {
        // Arrange
        int low = -2;
        int high = 5;

        // Act
        int result = SumOfIntegers.sum(low, high);

        // Assert
        assertEquals(12, result);
    }

    @Test
    public void shouldReturn0IfLowBiggerThanHigh() {
        // Arrange
        int low = 1;
        int high = 10;

        // Act
        int result = SumOfIntegers.sum(high, low);

        // Assert
        assertEquals(0, result);
    }
}
