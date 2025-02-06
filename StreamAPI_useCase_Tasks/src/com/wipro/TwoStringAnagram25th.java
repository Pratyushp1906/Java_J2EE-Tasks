package com.wipro;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;

public class TwoStringAnagram25th {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        Map<Character, Long> freqMap1 = str1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> freqMap2 = str2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return freqMap1.equals(freqMap2);
    }

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        System.out.println(areAnagrams(str1, str2)); // Output: true
    }
}
