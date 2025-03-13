package com.daily.concepts.immutable;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// When key is mutable. Not recommended implementation
		Map<Employee, Integer> map = new HashMap<>();//map of employee and years of experience
		Employee e1 = new Employee("Jane","TCS");
		Employee e2 = new Employee("John","Cognizant");
//		map.put(e1, 2);
//		map.put(e2, 5);
//		
//		e1.setName("Tom");
//		map.forEach((key,value)-> System.out.println("key: "+key.getName()+", value: "+value));
		
		//When key is immutable
	}
}
