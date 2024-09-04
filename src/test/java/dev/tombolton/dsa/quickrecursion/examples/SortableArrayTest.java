package dev.tombolton.dsa.quickrecursion.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortableArrayTest {
    @Test
    public void shouldSortArray() {
        // Arrange
        int[] array = {0, 5, 2, 1, 6, 3};
        SortableArray sortableArray = new SortableArray(array);

        // Act
        sortableArray.quicksort();

        // Assert
        assertArrayEquals(new int[]{0, 1, 2, 3, 5, 6}, sortableArray.array);
    }

    @Test
    public void shouldFindKthLowestValue() {
        // Arrange
        int[] array = {0, 50, 20, 10, 60, 30};
        SortableArray sortableArray = new SortableArray(array);

        // Act
        int result = sortableArray.quickselect(1);

        // Assert
        assertEquals(10, result);
    }
}
