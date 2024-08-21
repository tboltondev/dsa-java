package dev.tombolton.dsa.stacksAndQueues.examples.JavaScriptLinter;

import dev.tombolton.dsa.stacksAndQueues.Stack;
import dev.tombolton.dsa.stacksAndQueues.examples.JavaScriptLinter.Exceptions.*;

import java.util.Map;

public class JavaScriptLinter {
    Stack<Character> openingBraces = new Stack<>();

    public void lint(String javascriptCode) throws Exception {
        this.openingBraces.clear();

        for (Character character : javascriptCode.toCharArray()) {
            if (this.isOpeningBrace(character)) {
                this.openingBraces.push(character);

            } else if (this.isClosingBrace(character)) {
                if (this.openingBraces.isEmpty()) {
                    throw new MissingOpeningBraceException(character);
                }

                Character openingBrace = this.openingBraces.pop();

                if (this.isNotAMatch(openingBrace, character)) {
                    throw new MismatchedOpeningBraceException(character);
                }
            }
        }

        if (!this.openingBraces.isEmpty()) {
            Character unclosedBrace = this.openingBraces.read();
            throw new MissingClosingBraceException(unclosedBrace);
        }
    }

    private Boolean isOpeningBrace(Character c) {
        return c == '(' || c == '[' || c == '{';
    }

    private Boolean isClosingBrace(Character c) {
        return c == ')' || c == ']' || c == '}';
    }

    private Boolean isNotAMatch(Character openingBrace, Character closingBrace) {
        Map<Character, Character> bracePairs = Map.of('(', ')', '[', ']', '{', '}');
        return closingBrace != bracePairs.get(openingBrace);
    }
}
