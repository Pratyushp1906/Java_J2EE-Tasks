package com.wipro;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeDet {
    private String name;
    private int age;
    private String department;
    
    public EmployeeDet(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getDepartment() {
        return department;
    }
    
    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }
}

public class Young19th {
    public static void main(String[] args) {
        List<EmployeeDet> employees = Arrays.asList(
            new EmployeeDet("pratyush", 22, "IT"),
            new EmployeeDet("Rk sir", 30, "HR"),
            new EmployeeDet("Kumar", 22, "IT"),
            new EmployeeDet("goutham", 28, "HR"),
            new EmployeeDet("yashwanth", 26, "Finance"),
            new EmployeeDet("mayank", 24, "Finance")
        );
        
        Map<String, EmployeeDet> youngestEmployees = employees.stream()
            .collect(Collectors.toMap(
                EmployeeDet::getDepartment,
                e -> e,
                (e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2
            ));
        
        youngestEmployees.forEach((dept, emp) -> 
            System.out.println("Department: " + dept + ", Youngest Employee: " + emp)
        );
    }
}

