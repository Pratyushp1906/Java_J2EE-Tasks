package com.wipro;

import java.util.*;
import java.util.stream.*;

public class Sort7th {
    public static void main(String[] args) {
     
        List<String> strings = Arrays.asList("Banana", "Apple", "Orange", "Mango", "Pineapple");

    
        List<String> sortedAsc = strings.stream().sorted().collect(Collectors.toList());
                
                                        
        System.out.println("Ascending Order: " + sortedAsc);

      
        List<String> sortedDesc = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
                                        
                                         
        System.out.println("Descending Order: " + sortedDesc);
    }
}

