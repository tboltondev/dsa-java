package dev.tombolton.dsa.hashTables.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySubsetTest {
    @Test
    public void shouldReturnTrueIfIsSubset() {
        // Arrange
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 3, 5};

        // Act
        boolean result = ArraySubset.isSubset(arr1, arr2);

        // Assert
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfNotSubset() {
        // Arrange
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 3, 7};

        // Act
        boolean result = ArraySubset.isSubset(arr1, arr2);

        // Assert
        Assertions.assertFalse(result);
    }
}
