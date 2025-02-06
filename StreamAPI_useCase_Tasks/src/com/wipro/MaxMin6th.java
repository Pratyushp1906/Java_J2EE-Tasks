package com.wipro;

import java.util.*;
import java.util.stream.*;

public class MaxMin6th {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(10, 20, 30, 5, 50, 40);

      
        Optional<Integer> maxValue = numbers.stream().max(Integer::compareTo);
                                            

        
        Optional<Integer> minValue = numbers.stream().min(Integer::compareTo);

      
        maxValue.ifPresent(max -> System.out.println("Maximum Value: " + max));
        minValue.ifPresent(min -> System.out.println("Minimum Value: " + min));
    }
}

