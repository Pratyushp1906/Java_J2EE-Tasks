package com.wipro;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeDetails {
    private String name;
    private double salary;

    public EmployeeDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{name='" + name + "', salary=" + salary + "}";
    }
}

public class SortEmployee17th {
    public static void main(String[] args) {
        List<EmployeeDetails> employees = Arrays.asList(
            new EmployeeDetails("Pratyush", 55000),
            new EmployeeDetails("Rk sir", 72000),
            new EmployeeDetails("Kumar", 48000),
            new EmployeeDetails("Goutham", 91000),
            new EmployeeDetails("Yahswanth", 66000)
        );

        // Sorting employees by salary in descending order using Stream API
        List<EmployeeDetails> sortedEmployees = employees.stream()
            .sorted(Comparator.comparingDouble(EmployeeDetails::getSalary).reversed())
            .collect(Collectors.toList());

        // Display the sorted list
        sortedEmployees.forEach(System.out::println);
    }
}

