package com.yesh.java.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStringExample {

	public static void main(String[] args) {
		
		// list with duplicates
		
		List<String> fruits = Arrays.asList("Apple","Banana","Apple","Grapes","Cherry","Grapes");
		
		// list without duplicates
		
		List<String> fruitsDistinct = fruits.stream()
											.distinct()
											.collect(Collectors.toList());
		
		System.out.println(fruitsDistinct);
		
		 // list without duplicates
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,10,30,50);
		
		List<Integer> numbersDistinct = numbers.stream()
											  .distinct()
											  .collect(Collectors.toList());
		
		System.out.println(numbersDistinct);
		
		
		
		

	}

}
