package com.wipro;

import java.util.Arrays;

public class MergeSortedArray {
    // Function to merge two sorted arrays without extra space
    static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int gap = (n + m);
        
        // Function to calculate next gap
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            int i, j;

            // Comparing elements in the first array
            for (i = 0; i + gap < n; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    swap(arr1, i, i + gap);
                }
            }

            // Comparing elements between both arrays
            for (j = gap > n ? gap - n : 0; i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    swapBetweenArrays(arr1, arr2, i, j);
                }
            }

            // Comparing elements in the second array
            if (j < m) {
                for (j = 0; j + gap < m; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        swap(arr2, j, j + gap);
                    }
                }
            }
        }
    }

    // Function to calculate next gap
    static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap + 1) / 2;
    }

    // Swap elements within the same array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Swap elements between two arrays
    static void swapBetweenArrays(int[] arr1, int[] arr2, int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    // Main function to test the merge function
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        merge(arr1, arr2);

        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }
}

