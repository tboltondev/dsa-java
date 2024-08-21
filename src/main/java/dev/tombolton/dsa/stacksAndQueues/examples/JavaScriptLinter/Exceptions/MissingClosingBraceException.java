package dev.tombolton.dsa.stacksAndQueues.examples.JavaScriptLinter.Exceptions;

public class MissingClosingBraceException extends Exception {
    public MissingClosingBraceException(Character character) {
        super(character + " does not have closing brace");
    }
}
