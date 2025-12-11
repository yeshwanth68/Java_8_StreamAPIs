package com.yesh.java.programs;

import java.util.Arrays;
import java.util.List;

public class find_max_number_in_a_list {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		int max = numbers.stream().reduce(Integer::max).orElseThrow();
		
		System.out.println(max);
		
		
		int max1 = numbers.stream().mapToInt(i -> i)
                .max()
                .orElseThrow();
		
		System.out.println(max1);

	}

}
