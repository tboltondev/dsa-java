package dev.tombolton.dsa.quickrecursion.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DuplicateValuesTest {
    @Test
    public void shouldReturnTrueIfHasDuplicate() {
        // Arrange
        SortableArray sortableArray = new SortableArray(new int[]{5, 9, 3, 2, 4, 5, 6});

        // Act
        boolean result = DuplicateValues.hasDuplicate(sortableArray);

        // Assert
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfNoDuplicate() {
        // Arrange
        SortableArray sortableArray = new SortableArray(new int[]{5, 9, 3, 2, 4, 1, 6});

        // Act
        boolean result = DuplicateValues.hasDuplicate(sortableArray);

        // Assert
        assertFalse(result);
    }
}
