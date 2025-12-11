package com.yesh.java.programs;

import java.util.Arrays;
import java.util.List;

public class find_first_element {

	public static void main(String[] args) {
		
		List<String> numbers = Arrays.asList("a","b","c");
		
		String first = numbers.stream().findFirst().orElseThrow();
		
		System.out.println(first);
		
		

	}

}
