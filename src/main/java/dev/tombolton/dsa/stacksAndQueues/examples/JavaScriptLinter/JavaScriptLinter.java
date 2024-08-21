package dev.tombolton.dsa.stacksAndQueues.examples.JavaScriptLinter;

import dev.tombolton.dsa.stacksAndQueues.Stack;
import dev.tombolton.dsa.stacksAndQueues.examples.JavaScriptLinter.Exceptions.*;

import java.util.Map;

public class JavaScriptLinter {
    Stack<Character> stack = new Stack<>();

    public void lint(String jsCode) throws Exception {
        this.stack.clear();

        for (Character character : jsCode.toCharArray()) {
            if (this.isOpeningBrace(character)) {
                this.stack.push(character);

            } else if (this.isClosingBrace(character)) {
                if (this.stack.isEmpty()) {
                    throw new MissingOpeningBraceException(character);
                }

                Character openingBrace = this.stack.pop();

                if (this.isNotAMatch(openingBrace, character)) {
                    throw new MismatchedOpeningBraceException(character);
                }
            }
        }

        if (!this.stack.isEmpty()) {
            Character unclosedBrace = this.stack.read();
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
