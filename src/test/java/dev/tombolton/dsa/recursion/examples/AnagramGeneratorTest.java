package dev.tombolton.dsa.recursion.examples;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class AnagramGeneratorTest {
    @Test
    public void shouldReturnAllAnagrams() {
        // Arrange
        String string = "abcde";
        List<String> expected = List.of("abcde", "bacde", "bcade", "bcdae", "bcdea", "acbde", "cabde",
                "cbade", "cbdae", "cbdea", "acdbe", "cadbe", "cdabe", "cdbae", "cdbea", "acdeb", "cadeb", "cdaeb",
                "cdeab", "cdeba", "abdce", "badce", "bdace", "bdcae", "bdcea", "adbce", "dabce", "dbace", "dbcae",
                "dbcea", "adcbe", "dacbe", "dcabe", "dcbae", "dcbea", "adceb", "daceb", "dcaeb", "dceab", "dceba",
                "abdec", "badec", "bdaec", "bdeac", "bdeca", "adbec", "dabec", "dbaec", "dbeac", "dbeca", "adebc",
                "daebc", "deabc", "debac", "debca", "adecb", "daecb", "deacb", "decab", "decba", "abced", "baced",
                "bcaed", "bcead", "bceda", "acbed", "cabed", "cbaed", "cbead", "cbeda", "acebd", "caebd", "ceabd",
                "cebad", "cebda", "acedb", "caedb", "ceadb", "cedab", "cedba", "abecd", "baecd", "beacd", "becad",
                "becda", "aebcd", "eabcd", "ebacd", "ebcad", "ebcda", "aecbd", "eacbd", "ecabd", "ecbad", "ecbda",
                "aecdb", "eacdb", "ecadb", "ecdab", "ecdba", "abedc", "baedc", "beadc", "bedac", "bedca", "aebdc",
                "eabdc", "ebadc", "ebdac", "ebdca", "aedbc", "eadbc", "edabc", "edbac", "edbca", "aedcb", "eadcb",
                "edacb", "edcab", "edcba");

        // Act
        List<String> anagrams = AnagramGenerator.generate(string);

        // Assert
        assertIterableEquals(expected, anagrams);
    }
}
