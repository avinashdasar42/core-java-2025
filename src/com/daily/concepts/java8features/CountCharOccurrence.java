package com.daily.concepts.java8features;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharOccurrence {

	public static void main(String[] args) {
		String input = "automotiveua";

		 Map<Character, Long> charCount = input.chars()
		            .mapToObj(c -> (char) c) // Convert int to Character
		            .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new, Collectors.counting()));

		 System.out.println(charCount);
		 
		 
		 Character ch = input.chars()
		            .mapToObj(c -> (char) c) // Convert int to Character
		            .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new, Collectors.counting()))
		            .entrySet().stream()
		            .filter(entry -> entry.getValue() == 1)
		            .map(entry -> entry.getKey())
		            .findFirst()
		            .orElse(null);

		 System.out.println(ch);

	}

}
