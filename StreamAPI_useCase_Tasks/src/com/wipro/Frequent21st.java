package com.wipro;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequent21st{
    public static void main(String[] args) {
        String paragraph = "Hello I am pratyush from java batch. java is my favourite language. java is an object oriented language.";

        // Finding most frequent word
        String mostFrequentWord = Arrays.stream(paragraph.toLowerCase().split("\\W+")) // Split words
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
                .entrySet().stream() // Convert map to stream
                .max(Map.Entry.comparingByValue()) // Find max by value
                .map(Map.Entry::getKey) // Get the word
                .orElse(null); // Handle empty case

        System.out.println("Most Frequent Word: " + mostFrequentWord);
    }
}

