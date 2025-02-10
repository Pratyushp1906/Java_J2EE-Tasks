package com.wipro;

import java.util.Arrays;

public class RearrangeArray {
    public static void rearrangeArray(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] temp = new int[n];
        int left = 0, right = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                temp[i] = arr[right--]; // Assign larger element to even index
            } else {
                temp[i] = arr[left++];  // Assign smaller element to odd index
            }
        }

        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 5, 6, 8, 7};
        rearrangeArray(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}

