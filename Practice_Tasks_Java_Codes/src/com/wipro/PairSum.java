package com.wipro;

import java.util.HashSet;

public class PairSum {
    public static void findPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                found = true;
                return; // Exiting after finding the first pair
            }
            set.add(num);
        }
        
        if (!found) {
            System.out.println("No pair found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 1, 8};
        int target = 9;
        findPair(arr, target);
    }
}

