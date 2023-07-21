package com.vtseva.strings;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] charArr = str.toCharArray();
		System.out.println("Array Length : "+ charArr.length);
		/*
		 *  Hello World
		 *  01234
		 *  1) 0 & 4 swap
		 *  2) 1 & 3 swap
		 *  3) 2 & 2 not required
		 *  
		 *  iaS
		 *  012
		 */
		int left = 0;
		int right = str.length()-1;
//		System.out.println(charArr[0]);
//		System.out.println(charArr[4]);
//		charArr[4] = charArr[0];
//		System.out.println(charArr[0]);
//		System.out.println(charArr[4]);
		
		while (left < right) {
			char temp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = temp;
			left++;
			right--;
		}
		
		System.out.println(charArr);
		
		

	}

}
