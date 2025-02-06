package com.wipro;

import java.util.*;
import java.util.stream.*;

public class Parallel20th {
    public static void main(String[] args) {
        // Generate a large list of numbers
        List<Integer> numbers = IntStream.rangeClosed(1, 1000000)
                                         .boxed()
                                         .collect(Collectors.toList());
        
        // Use parallel stream to sum the numbers
        long sum = numbers.parallelStream()
                          .mapToLong(Integer::longValue)
                          .sum();
       
        System.out.println("Sum of numbers is: " + sum);
    }
}

