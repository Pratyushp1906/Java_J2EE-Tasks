package com.wipro;

import java.util.*;
import java.util.stream.Collectors;

class Employees {
    private String name;
    private double salary;
    private String department;

    public Employees(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", department='" + department + "'}";
    }
}

public class AverageSalary18th {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
            new Employees("pratyush", 55000, "HR"),
            new Employees("rk sir", 72000, "Finance"),
            new Employees("kumar", 48000, "IT"),
            new Employees("mayank", 91000, "Finance"),
            new Employees("goutham", 66000, "HR"),
            new Employees("yashwanth", 50000, "IT")
        );

        // Group employees by department and calculate the average salary per department using Stream API
        Map<String, Double> avgSalaryPerDepartment = employees.stream()
            .collect(Collectors.groupingBy(
                Employees::getDepartment, 
                Collectors.averagingDouble(Employees::getSalary)
            ));

        
        avgSalaryPerDepartment.forEach((department, avgSalary) -> 
            System.out.println("Department: " + department + ", Average Salary: " + avgSalary)
        );
    }
}

