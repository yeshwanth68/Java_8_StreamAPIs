package com.yesh.java.programs;

import java.util.Map;
import java.util.stream.Collectors;

public class count_character_frequency {

	public static void main(String[] args) {
		
		String name ="Yeshwanth";
		
		Map<Object, Long> frequency= name.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		System.out.println(frequency);
		
		
		name.chars()
		.mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.forEach((k,v)->System.out.println("Key "+k+"  "+"Value "+v));
		

	}

}
