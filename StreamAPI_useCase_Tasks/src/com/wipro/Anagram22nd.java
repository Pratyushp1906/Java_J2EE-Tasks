package com.wipro;

import java.util.*;
import java.util.stream.Collectors;

public class Anagram22nd {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("listen", "silent", "enlist", "heart", "earth", "below", "elbow", "bowel");

        // Group words by sorted character representation
        Map<String, List<String>> anagramGroups = words.stream()
                .collect(Collectors.groupingBy(word -> word.chars()
                        .sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString()));

        // Filter out groups with only one word (no anagrams)
        List<List<String>> anagrams = anagramGroups.values().stream()
                .filter(group -> group.size() > 1)
                .collect(Collectors.toList());

       
        anagrams.forEach(System.out::println);
    }
}

