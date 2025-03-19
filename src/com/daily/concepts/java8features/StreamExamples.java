package com.daily.concepts.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        
        System.out.println(cities.stream().anyMatch(aCity -> aCity.startsWith("D")));
        
        //GroupingBy
        List<String> names = Arrays.asList("Avinash", "Praveen", "Dinesh", "Ashwin");
        Map<Character, List<String>> groupedByLetter = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(groupedByLetter);
		

        //max
        List<Integer> myList = Arrays.asList(10,16,8,49,24,98,98,32,10);
        int max =  myList.stream()
                         .max(Integer::compare)
                         .get();
        System.out.println(max);
        
        //groupingBY on char count
        String str = "Hello";
        Map<String, Long> mapObject = Arrays.stream(str.split(""))
                .map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
}
