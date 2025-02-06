package com.wipro;

import java.util.*;
import java.util.stream.Collectors;

public class Group13th {
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "Cahsew", "grapes", "kiwi", "mango");

        // Grouping words by their length using Stream API
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        // Display the grouped words
        groupedByLength.forEach((length, wordList) -> 
            System.out.println("Length " + length + ": " + wordList)
        );
    }
}

