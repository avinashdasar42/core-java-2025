package com.daily.concepts.string;

public class StringCodeExample {
	
	public static void main(String[] args) {
		String str = "Hello World";
		//Split method
		String[] strArray = str.split(" ");
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		
		//charAt
		char ch = str.charAt(0);
		System.out.println(ch);

		//substring
		String newStr = str.substring(1,5);
		System.out.println(newStr);

		//equlas & compareTo
		int result = str.compareTo("Hello World");
		System.out.println(result);
		boolean isEqual = str.equals("Hello World!!");
		System.out.println(isEqual);
	}

}
