package com.yesh.java.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverse_each_word_in_string {

	public static void main(String[] args) {
		
		
		String word = "Hello World";
		
		String reverse = Arrays.stream(word.split(" "))
								.map(w -> new StringBuilder(w).reverse().toString())
								.collect(Collectors.joining(" "));
		
		System.out.println(reverse);

	}

}
