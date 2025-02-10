package com.wipro;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroesToEnd(int[] arr) {
        int nonZeroIndex = 0;
        
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // If element is non-zero, place it at the next available position
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }
        
        // Fill remaining positions with zeroes
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        moveZeroesToEnd(arr);
        
        System.out.println("Modified array: " + Arrays.toString(arr));
    }
}

