package com.wipro;

import java.util.HashMap;

public class NonRepeatingElement {
    public static int findFirstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // Count the frequency of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the first element with a count of 1
        for (int num : arr) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }
        
        return -1; // Return -1 if no non-repeating element is found
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4, 5, 1, 2};
        int result = findFirstNonRepeating(arr);
        
        if (result != -1) {
            System.out.println("First non-repeating element: " + result);
        } else {
            System.out.println("No non-repeating element found");
        }
    }
}

