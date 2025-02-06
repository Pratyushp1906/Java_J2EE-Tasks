package com.wipro;

import java.util.Arrays;
import java.util.List;

public class Count8th {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 3, 17, 8, 10, 25, 15);

        long count = numbers.stream().filter(num -> num > 10).count(); 

        System.out.println("Count of numbers greater than 10: " + count);
    }
}

