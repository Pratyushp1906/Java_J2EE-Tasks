package com.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Name3rd {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kumar", "Pratyush", "Rk Sir", "Aditya", "Amit", "Yashwanth");

     
        List<String> namesStartingWithA = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
                                              
                                               

        // Display the filtered names
        System.out.println("Names starting with A are: " + namesStartingWithA);
    }
}

