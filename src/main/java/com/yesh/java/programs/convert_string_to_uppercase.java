package com.yesh.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class convert_string_to_uppercase {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("apple","banana","grapes");
		
		List<String> uppercase = names.stream()
										.map(n->n.toUpperCase())
										.collect(Collectors.toList());
		
		System.out.println(uppercase);

	}

}
