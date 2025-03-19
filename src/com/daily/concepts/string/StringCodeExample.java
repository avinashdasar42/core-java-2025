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

		//equalsIgnoreCase & compareToIgnoreCase
		String str1 = "HELLO",str2 = "hello";
		int result1 = str1.compareToIgnoreCase(str2);// 0, 1 if str1 >str2. -1 if str1 < str2
		boolean result2 = str1.equalsIgnoreCase(str2); //true
		System.out.println(result1+ " : "+result2);
		
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
		
		//trim
		str = "  hello   ";
		System.out.println(str);
		System.out.println(str.trim());
		
		//isBlank & isEmpty methods		
		str = "  ";
		System.out.println(str.isBlank()); //true
		System.out.println(str.isEmpty()); //false
		
		//concat & '+' operand >> both have same functionality of concatenating strings
		// concat() >> only works with String data type
		// '+' operand >> works with any data type & handles null scenario too 
		String s1 = "Hello", s2 = "World!", s3 = null;
		int num = 100;
		System.out.println(s1+s2);//HelloWorld!
		System.out.println(s1.concat(s2));//HelloWorld!
		System.out.println(s1+s3);//Hellonull
		System.out.println(s1.concat(s3));//throws null pointer exception
		System.out.println(s1+num);
		
	}
}
