package dev.tombolton.dsa.recursion.examples;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindDirectories {
    public static void find(String searchDirectory) throws IOException {
        try (DirectoryStream<Path> pathsStream = Files.newDirectoryStream(Paths.get(searchDirectory))) {
            for (Path path : pathsStream) {
                if (Files.isDirectory(path)) {
                    System.out.println(path.getFileName().toString());
                    find(searchDirectory + "/" + path.getFileName().toString());
                }
            }
        }
    }
}
