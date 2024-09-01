package dev.tombolton.dsa.recursion.exercises.findevens;

import java.util.ArrayList;
import java.util.List;

public class FindEvens {
    public static List<Integer> find(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return new ArrayList<>();
        }

        if (numbers.getFirst() % 2 == 0) {
            List<Integer> evens = find(numbers.subList(1, numbers.size()));
            evens.addFirst(numbers.getFirst());
            return evens;
        }

        return find(numbers.subList(1, numbers.size()));
    }
}
