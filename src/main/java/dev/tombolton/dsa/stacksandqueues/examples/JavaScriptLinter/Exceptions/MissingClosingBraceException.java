package dev.tombolton.dsa.stacksandqueues.examples.JavaScriptLinter.Exceptions;

public class MissingClosingBraceException extends Exception {
    public MissingClosingBraceException(Character character) {
        super(character + " does not have closing brace");
    }
}
