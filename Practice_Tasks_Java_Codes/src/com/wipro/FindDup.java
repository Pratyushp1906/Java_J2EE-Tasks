package com.wipro;

import java.util.HashSet;

public class FindDup {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num; // Duplicate found
            }
            seen.add(num);
        }
        return -1; // Should never reach here if one duplicate exists
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2}; // Example array
        System.out.println("Duplicate number: " + findDuplicate(nums));
    }
}

