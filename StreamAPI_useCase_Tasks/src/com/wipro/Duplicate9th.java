package com.wipro;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate9th{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8, 9);

        // Finding duplicate elements using Streams
        Set<Integer> duplicates = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("Duplicate elements are: " + duplicates);
    }
}
