package com.yesh.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class find_all_event_numbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,13,4,2,5,1);
		
		List<Integer> even = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(even);

	}

}
