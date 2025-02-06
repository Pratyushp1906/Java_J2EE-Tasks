package com.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square4th {
    public static void main(String[] args) {
      
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
                                              
                                              

       
        System.out.println("Original list: " + numbers);
        System.out.println("List with squares " + squaredNumbers);
    }
}
