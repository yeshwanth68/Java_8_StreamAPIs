package com.yesh.java.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class first_non_repeated_character {

	public static void main(String[] args) {
		
		String name = "swiss";
		
		Character letter = name.chars()
						  .mapToObj(c-> (char) c)
						  .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
						  .entrySet()
						  .stream()
						  .filter(e->e.getValue()==1)
						  .map(Map.Entry::getKey)
						  .findFirst()
						  .orElse(null);
		
		System.out.println(letter);
		
		
		LinkedHashMap<Character,Long> lettermap = name.chars()
														.mapToObj(a-> (char) a)
														.collect(Collectors.groupingBy(Function.identity(),
																LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(lettermap);
		
		Optional<Map.Entry<Character, Long>> first = lettermap.entrySet().stream().filter(e->e.getValue()==1).findFirst();
		
		System.out.println(first);
														
		
				

	}

}
