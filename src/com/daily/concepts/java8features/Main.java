package com.daily.concepts.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee(1,"Ashwin",1000);
		Employee e2 = new Employee(1,"Ashish",2000);
		Employee e3 = new Employee(3,"Avinash",1200);
		Employee e4 = new Employee(4,"Rushi",1500);
		
		list.add(e1);list.add(e2);list.add(e3);	list.add(e4);	
		List<Employee> result = list.stream().sorted(Comparator.comparing(Employee :: getId)).collect(Collectors.toList());		
		System.out.println("After >> "+ result);
		
		
		Optional<Employee> first = list.stream().sorted(Comparator.comparingDouble(Employee :: getSalary).reversed()).skip(1).findFirst();
		
		System.out.println(first.get());
	}

}

class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary=salary;
	}
	
	
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}	
}
