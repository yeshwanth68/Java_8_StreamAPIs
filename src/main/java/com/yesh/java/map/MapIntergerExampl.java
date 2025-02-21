package com.yesh.java.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapIntergerExampl {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//Multiply each number by 2 using map
		
		List<Integer> multiplyBy2 = numbers.stream()
										   .map(n->n*2)
										   .collect(Collectors.toList());
		
		System.out.println(multiplyBy2);

	}

}
