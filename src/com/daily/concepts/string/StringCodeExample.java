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

		//startsWith & endsWith
		boolean flag1 = str.startsWith("Hel");
		boolean flag2 = str.endsWith("Hel");
		System.out.println("flag1: "+flag1);
		System.out.println("flag2: "+flag2);
		
		//contains method
		boolean flag3 = str.contains("Wor");
		System.out.println("flag3: "+flag3);

		//upperCase & lowerCase
		String toLowerCase = str.toLowerCase();
		String toUpperCase = str.toUpperCase();
		System.out.println("toLowerCase: "+toLowerCase);
		System.out.println("toUpperCase: "+toUpperCase);
		
		//reverse given string
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length-1;
		
		while(left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		
		String reversedStr = String.valueOf(charArray);
		System.out.println(reversedStr);
		
		//join method
		//public String join(CharSequence separator, CharSequence... elements)
		String fruits = String.join(" ", "Orange", "Apple", "Mango");
		System.out.println(fruits);		
		
	}
}
