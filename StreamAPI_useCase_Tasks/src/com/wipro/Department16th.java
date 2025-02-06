package com.wipro;

import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }
}

public class Department16th {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Charlie", "IT"),
            new Employee("David", "Finance"),
            new Employee("Eva", "IT"),
            new Employee("Frank", "HR")
        );

        // Grouping by department and counting employees
        Map<String, Long> departmentCounts = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        // Finding the department with the maximum number of employees
        String departmentWithMostEmployees = departmentCounts.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("No Department Found");

        System.out.println("Department with the most employees: " + departmentWithMostEmployees);
    }
}

