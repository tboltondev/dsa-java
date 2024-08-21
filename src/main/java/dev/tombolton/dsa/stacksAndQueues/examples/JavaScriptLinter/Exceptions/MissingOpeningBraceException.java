package dev.tombolton.dsa.stacksAndQueues.examples.JavaScriptLinter.Exceptions;

public class MissingOpeningBraceException extends Exception {
    public MissingOpeningBraceException(Character character) {
        super(character + " does not have opening brace");
    }
}
