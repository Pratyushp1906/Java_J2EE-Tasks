package com.wipro;

import java.util.HashSet;

public class SmallestPositive {
    public static int findSmallestMissingPositive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add all positive numbers to the set
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }
        
        // Find the smallest missing positive number
        int smallest = 1;
        while (set.contains(smallest)) {
            smallest++;
        }
        
        return smallest;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("Smallest missing positive number: " + findSmallestMissingPositive(arr));
    }
}
