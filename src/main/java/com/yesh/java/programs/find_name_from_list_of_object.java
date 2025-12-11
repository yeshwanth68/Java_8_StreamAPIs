package com.yesh.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class person{
	
	private String name;
	private long age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public person(String name, long age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

public class find_name_from_list_of_object {

	public static void main(String[] args) {
		
		List<person> person = Arrays.asList(new person("Vishal",26),new person("Yeshwanth",26));
		
		List<String> names = person.stream().map(p -> p.getName()).collect(Collectors.toList());
		
		System.out.println(names);
		
		

	}

}
