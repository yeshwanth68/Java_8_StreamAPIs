package com.yesh.java.programs;

import java.util.Arrays;
import java.util.List;

public class find_min_number_in_a_list {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		int min = numbers.stream().reduce(Integer::min).orElseThrow();
		
		System.out.println(min);
		
		
		int min1 = numbers.stream().mapToInt(i -> i)
                .min()
                .orElseThrow();
		
		System.out.println(min1);

	}

}
