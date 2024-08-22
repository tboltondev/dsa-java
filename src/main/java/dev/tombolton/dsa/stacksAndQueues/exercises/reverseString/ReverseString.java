package dev.tombolton.dsa.stacksAndQueues.exercises.reverseString;

import dev.tombolton.dsa.stacksAndQueues.Stack;

public class ReverseString {
    public static String reverse(String input) {
        Stack<Character> characters = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (Character c : input.toCharArray()) {
            characters.push(c);
        }

        while (!characters.isEmpty()) {
            output.append(characters.pop());
        }

        return output.toString();
    }
}
