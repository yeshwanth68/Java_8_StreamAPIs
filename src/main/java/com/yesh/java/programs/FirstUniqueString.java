package com.yesh.java.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueString {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "apple", "banana", "apple", "mango", "orange", "mango"
        );

        // Step 1: Build frequency map preserving order
        LinkedHashMap<String, Long> freqMap =
                names.stream()
                     .collect(Collectors.groupingBy(
                             Function.identity(),
                             LinkedHashMap::new,
                             Collectors.counting()
                     ));

        // Step 2: Find first entry with count = 1
        Optional<String> firstUnique =
                freqMap.entrySet().stream()
                       .filter(e -> e.getValue() == 1)
                       .map(Map.Entry::getKey)
                       .findFirst();

        System.out.println(firstUnique.orElse("No unique string found"));
    }
}

