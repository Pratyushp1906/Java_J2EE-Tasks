package com.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecHigh12th {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 6, 8, 4);

        Optional<Integer> secondHighest = numbers.stream()
            .distinct()               // Remove duplicate values
            .sorted((a, b) -> b - a)  // Sort in descending order
            .skip(1)                  // Skip the highest number
            .findFirst();             // Get the next (second-highest) number

        if (secondHighest.isPresent()) {
            System.out.println("The second highest number is: " + secondHighest.get());
        } else {
            System.out.println("The list does not have a second highest number.");
        }
    }
}

