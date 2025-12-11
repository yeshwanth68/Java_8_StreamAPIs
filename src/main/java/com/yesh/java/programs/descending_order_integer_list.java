package com.yesh.java.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class descending_order_integer_list {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(8, 1, 2, 5, 9, 10, 7, 6, 3, 4);

		List<Integer> asc = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(asc);
		
		
		List<Integer> asc1 = numbers.stream().sorted((a,b)->Integer.compare(b, a)).collect(Collectors.toList());

		System.out.println(asc1);
		
		

	}

}
