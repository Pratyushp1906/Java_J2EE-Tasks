package com.wipro;

import java.util.HashMap;

public class FirstRepeatingElement {
    public static int findFirstRepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return arr[i]; // First repeating element found
            }
            map.put(arr[i], i);
        }
        
        return -1; // Return -1 if no repeating element is found
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int firstRepeating = findFirstRepeating(arr);
        
        if (firstRepeating != -1) {
            System.out.println("First repeating element: " + firstRepeating);
        } else {
            System.out.println("No repeating elements found.");
        }
    }
}
