package com.yesh.java.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class find_duplicate_numbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,13,4,2,5,1,12,13,9,10);
		
		Set<Integer> duplicates = new HashSet<Integer>();
		
		List<Integer> dup = numbers.stream()
		.filter(i-> !duplicates.add(i))
		.collect(Collectors.toList());
		
		System.out.println(dup);
		
		

	}

}
