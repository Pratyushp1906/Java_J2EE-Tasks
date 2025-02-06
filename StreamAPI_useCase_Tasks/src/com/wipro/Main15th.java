package com.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main15th {
    public static void main(String[] args) {
        List<Employee15th> employees = Arrays.asList(
            new Employee15th("Pratyush", 48000),
            new Employee15th("Kumar", 52000),
            new Employee15th("Rk Sir", 60000),
            new Employee15th("Yashwanth", 45000),
            new Employee15th("Goutham", 75000)
        );

        // Using Stream API to filter employees with salary > 50,000
        List<Employee15th> highEarners = employees.stream()
                                              .filter(emp -> emp.getSalary() > 50000)
                                              .collect(Collectors.toList());

        // Displaying the high earners
        highEarners.forEach(System.out::println);
    }
}
