package com.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even1st {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(13, 22, 44, 55, 67, 98, 103);

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()); 
        System.out.println("even numbers from the list are: " + evenNumbers);
    }
}

