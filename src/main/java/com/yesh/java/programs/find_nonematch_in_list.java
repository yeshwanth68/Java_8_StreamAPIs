package com.yesh.java.programs;

import java.util.Arrays;
import java.util.List;

public class find_nonematch_in_list {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Apple","auto","banana","carrot");
		
		boolean nonematch = names.stream().noneMatch(n->n.length()>3);
		
		System.out.println(nonematch);
		

	}

}
