package com.wipro;

import java.util.*;

public class SingleElementFind {
    public static int findSingleElement(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num; // XOR operation
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 4, 1, 3, 2};
        System.out.println("Element that appears only once: " + findSingleElement(arr));
    }
}

