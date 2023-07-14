package com.vtseva.arrays;

public class PrintArray {

	public static void main(String[] args) {
		// 3, 6 , 4, 5
		int[] a = {3,6,4,5};
		//		  a[0], a[1], a[2], a[3]
		//System.out.println("array length :"+a.length);
		printArray(a);
		
	}
	
	public static void printArray(int[] a) {
		for(int i=0; i< a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
