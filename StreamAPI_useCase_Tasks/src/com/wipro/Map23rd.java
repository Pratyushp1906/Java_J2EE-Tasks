package com.wipro;

import java.util.*;
import java.util.stream.Collectors;

class Employeed {
    private int id;
    private String name;

    public Employeed(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Map23rd {
    public static void main(String[] args) {
        List<Employeed> employees = Arrays.asList(
            new Employeed(101, "pratyush"),
            new Employeed(102, "rk sir"),
            new Employeed(103, "kumar")
        );

        // Convert List to Map (ID -> Name)
        Map<Integer, String> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employeed::getId, Employeed::getName));

        // Print the Map
        employeeMap.forEach((id, name) -> 
            System.out.println("ID: " + id + ", Name: " + name)
        );
    }
}

