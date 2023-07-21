package com.vtseva.strings;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str = "madam";
		char[] charArr = str.toCharArray();
		
		int left = 0;
		int right = charArr.length-1;
		/*
		 * madam
		 * 01234
		 * hello
		 * 01234
		 */
		boolean result = true;
		while (left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				result = false;
				break;
			}
			left++;
			right--;
		}
		if(result) {
			System.out.println(str +" is a palindrome");
		} else {
			System.out.println(str +" is not a palindrome");
		}
		
	}

}
