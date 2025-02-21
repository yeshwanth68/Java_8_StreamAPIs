package com.yesh.java.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//Find the sume of all numbers in a list
		
		int sum = numbers.stream().reduce(0,Integer::sum);
		
		System.out.println(sum);

	}

}
