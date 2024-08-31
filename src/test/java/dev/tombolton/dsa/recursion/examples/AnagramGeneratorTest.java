package dev.tombolton.dsa.recursion.examples;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class AnagramGeneratorTest {
    @Test
    public void shouldReturnAllAnagrams() {
        // Arrange
        String string = "abcde";
        List<String> expected = List.of("abcde",
                "bacde",
                "bcade",
                "bcdae",
                "acbde",
                "cabde",
                "cbade",
                "cbdae",
                "acdbe",
                "cadbe",
                "cdabe",
                "cdbae",
                "abdce",
                "badce",
                "bdace",
                "bdcae",
                "adbce",
                "dabce",
                "dbace",
                "dbcae",
                "adcbe",
                "dacbe",
                "dcabe",
                "dcbae");

        // Act
        List<String> anagrams = AnagramGenerator.generate(string);

        // Assert
        assertIterableEquals(expected, anagrams);
    }
}
