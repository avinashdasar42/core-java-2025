package com.daily.concepts.immutable;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// When key is mutable. Not recommended implementation
		Map<Employee, Integer> map = new HashMap<>();//map of employee and years of experience
//		Employee e1 = new Employee("Jane","TCS");
//		Employee e2 = new Employee("John","Cognizant");
//		map.put(e1, 2);
//		map.put(e2, 5);
//		
//		e1.setName("Tom");
//		map.forEach((key,value)-> System.out.println("key: "+key.getName()+", value: "+value));
		
		//When key is immutable
		Company c1 = new Company("TCS","Mumbai");
		Company c2 = new Company("Infosys","Pune");
		Employee e1 = new Employee("Jane","Doe",c1);
		Employee e2 = new Employee("John","Doe",c2);
		
		map.put(e1, 2);
		map.put(e2, 5);
		
//		still mutable
//		e1.getCompany().setHeadquarter("London");	
//		map.forEach((key,value)-> System.out.println("key: "+key.getCompany().getHeadquarter()+", value: "+value));			
		
//		solution is deep cloning or copy constructor
		c1.setHeadquarter("France");	
		map.forEach((key,value)-> System.out.println("key: "+key.getCompany().getHeadquarter()+", value: "+value));
	
		
	}
}
