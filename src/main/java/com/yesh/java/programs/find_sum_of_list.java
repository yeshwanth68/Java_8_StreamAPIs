package com.yesh.java.programs;

import java.util.Arrays;
import java.util.List;

public class find_sum_of_list {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		long sum = numbers.stream().reduce(0,Integer::sum);
		
		System.out.println(sum);
		
		
		int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum1);
		

	}

}
