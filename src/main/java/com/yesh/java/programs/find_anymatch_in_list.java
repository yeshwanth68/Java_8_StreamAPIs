package com.yesh.java.programs;

import java.util.Arrays;
import java.util.List;

public class find_anymatch_in_list {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(8, 2, 10, 6,4);

		boolean anymatch = numbers.stream().filter(n->n%2==0).findAny().isPresent();
		
		System.out.println(anymatch);
	}

}
