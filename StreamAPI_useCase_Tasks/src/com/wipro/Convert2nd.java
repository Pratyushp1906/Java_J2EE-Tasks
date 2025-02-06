package com.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert2nd {
    public static void main(String[] args) {
    
        List<String> names = Arrays.asList("rk", "john", "alex");
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
              
                                           

        System.out.println(upperCaseNames);
    }
}
