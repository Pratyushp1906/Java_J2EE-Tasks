package com.wipro;

import java.util.Arrays;
import java.util.List;

public class Sum5th {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
//concept of (accumulator, currentElement)
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
                     
        System.out.println("Sum of all elements: " + sum);
    }
}
