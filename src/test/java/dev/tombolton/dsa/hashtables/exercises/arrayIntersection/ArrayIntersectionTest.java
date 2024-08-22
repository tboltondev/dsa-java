package dev.tombolton.dsa.hashtables.exercises.arrayIntersection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ArrayIntersectionTest {
    @Test
    public void shouldReturnIntersection() {
        // Arrange
        int[] arr1 = {2, 4, 6 ,8, 10, 12};
        int[] arr2 = {3, 6, 9, 12};

        // Act
        List<Integer> result = ArrayIntersection.findIntersection(arr1, arr2);

        // Assert
        Assertions.assertEquals(List.of(6, 12), result);
    }

    @Test
    public void shouldReturnEmptyListIfNoIntersection() {
        // Arrange
        int[] arr1 = {2, 4, 6, 8, 10, 12};
        int[] arr2 = {7, 14 ,21, 28};

        // Act
        List<Integer> result = ArrayIntersection.findIntersection(arr1, arr2);

        // Assert
        Assertions.assertEquals(List.of(), result);
    }
}
