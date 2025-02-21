package com.yesh.java.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class MapObjectExample {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee("Alice",30),
				new Employee("Bob",25),
				new Employee("Charlie",35),
				new Employee("David",28)
				);
		
		// extract the name of employees using map
		
		List<String> names = employees.stream()
									  .map(emp->emp.getName())
									  .collect(Collectors.toList());
		
		System.out.println(names);

	}

}
