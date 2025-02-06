package com.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove10th {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 6, 9, 10);

     
        List<Integer> uniqueNumbers = numbers.stream()
                                             .distinct()
                                             .collect(Collectors.toList());

   
        System.out.println("Original List: " + numbers);
        System.out.println("List after removing the duplicates: " + uniqueNumbers);
    }
}

