package com.yesh.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class remove_duplicates_number {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3,6,7,8,9,10,2);
		
		List<Integer> dup = numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(dup);
		
		
		List<Integer> distinct = new ArrayList<>(new LinkedHashSet<>(numbers));
		
		System.out.println(distinct);

	}

}
