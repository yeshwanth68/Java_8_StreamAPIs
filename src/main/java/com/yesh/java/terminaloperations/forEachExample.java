package com.yesh.java.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class forEachExample {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple","Banana","Apple","Grapes","Cherry","Grapes");
		
		// print all the names from a list
		
		fruits.stream().forEach(System.out::println);

	}

}
