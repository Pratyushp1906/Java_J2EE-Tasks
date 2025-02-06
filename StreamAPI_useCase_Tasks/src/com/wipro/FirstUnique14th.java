package com.wipro;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUnique14th {
    public static void main(String[] args) {
        String input = "aabbcdeff";
        Optional<Character> result = findFirstNonRepeatingChar(input);

        result.ifPresentOrElse(
            ch -> System.out.println("First non-repeating character: " + ch),
            () -> System.out.println("No non-repeating character found.")
        );
    }

    public static Optional<Character> findFirstNonRepeatingChar(String str) {
        Map<Character, Long> frequencyMap = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        return frequencyMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst();
    }
}

