package com.vtseva.loops;

public class EvenNumbers {

	public static void main(String[] args) {
		// between 1..20 , print all even numbers
		for(int i=1; i<20; i++) {
//			System.out.println(i);
			if(i%2==0) {
				System.out.println(i+" is even");
			}
		}

	}

}
