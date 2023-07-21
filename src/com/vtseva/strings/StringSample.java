package com.vtseva.strings;

public class StringSample {

	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "Hello";
//		System.out.println(str);
//		str = str + " " + "World!";
//		System.out.println(str);
//		str = str.concat(" Java");
//		System.out.println(str);
		System.out.println("Length of str :"+ str.length());
		/*
		 * Hello world!
		 * 01234567891011
		 */
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.substring(6));
//		System.out.println(str.substring(3, 5));
		System.out.println(str.equals(str1));
		System.out.println(str.compareTo(str1));
		
		

	}

}
