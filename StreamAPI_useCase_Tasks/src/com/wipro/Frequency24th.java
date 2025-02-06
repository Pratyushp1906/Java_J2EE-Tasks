package com.wipro;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency24th {
    public static void main(String[] args) {
        String input = "pratyush pandey";

        // Counting occurrences using Stream API
        Map<Character, Long> frequencyMap = input.chars()
            .mapToObj(c -> (char) c) // Convert int to Character
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Printing the result
        System.out.println(frequencyMap);
    }
}

