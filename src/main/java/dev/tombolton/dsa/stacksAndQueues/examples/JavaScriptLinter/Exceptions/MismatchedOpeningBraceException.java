package dev.tombolton.dsa.stacksAndQueues.examples.JavaScriptLinter.Exceptions;

public class MismatchedOpeningBraceException extends Exception {
    public MismatchedOpeningBraceException(Character character) {
        super(character + " has mismatched opening brace");
    }
}
