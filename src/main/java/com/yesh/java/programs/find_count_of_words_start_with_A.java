package com.yesh.java.programs;

import java.util.Arrays;
import java.util.List;

public class find_count_of_words_start_with_A {

	public static void main(String[] args) {
	
		List<String> names = Arrays.asList("Apple","auto","banana","carrot");
		
		long count = names.stream().filter(s->s.toLowerCase().startsWith("a")).count();
		
		System.out.println(count);
		
		

	}

}
