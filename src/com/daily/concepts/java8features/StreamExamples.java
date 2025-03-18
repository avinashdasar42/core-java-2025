package com.daily.concepts.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamExamples {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//filter out only even
		nums.stream().filter(n -> n%2==0).forEach(System.out :: println); 
		
		//filter out only odd numbers and double it
		nums.stream().filter(n -> n%2 ==1).map(n -> n*2).forEach(System.out :: println);	
		
		//sort
		nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println);
		
		//terminal operators
		Optional<Integer> first = nums.stream().filter(n-> n%3==0).findFirst();
		System.out.println(first.get());
		
		List<String> cities = Arrays.asList("Mumbai", "Delhi", "Bangalore");
        long count = cities.stream().count();
        System.out.println("Total cities: " + count);
        
        String city = cities.stream().findFirst().orElse(" ");
        System.out.println(city);
		
	}
}
