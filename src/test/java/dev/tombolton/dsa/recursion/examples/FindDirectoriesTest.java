package dev.tombolton.dsa.recursion.examples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDirectoriesTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void beforeEach() {
        System.setOut(new PrintStream(outputStreamCaptor));
        new File("abc/def").mkdirs();
        new File("abc/ghi/jkl/mno").mkdirs();
    }

    @AfterEach
    public void afterEach() {
        this.deleteDir(new File("abc"));
        System.setOut(standardOut);
    }

    @Test
    public void shouldPrintAllSubDirs() {
        // Arrange
        String dir = "abc";

        // Act & Assert
        assertDoesNotThrow(() -> FindDirectories.find(dir));
        assertEquals("ghi", outputStreamCaptor.toString().split("\n")[0]);
        assertEquals("jkl", outputStreamCaptor.toString().split("\n")[1]);
        assertEquals("mno", outputStreamCaptor.toString().split("\n")[2]);
        assertEquals("def", outputStreamCaptor.toString().split("\n")[3]);
    }

    private void deleteDir(File file) {
        for (File subFile : file.listFiles()) {
            if (subFile.isDirectory()) {
                deleteDir(subFile);
            } else {
                subFile.delete();
            }
        }
        file.delete();
    }
}
