package com.vtseva.loops;

public class PrimeNumber {

	public static void main(String[] args) {
		// any number divisible by 1 and itself is prime number
		// number 37;
		// if last digit is odd it is prime
		// 2 is divisible by that number
		// 3 is
		// 4 is divi
		// 37%18==0
		// 2..n/2
		
		// n/2	==0
		// n/3 == 0
		// n/4 == 0
		// n/5 == 0
		//..........
		// n/18 ==0
		int n = 9;
		boolean isPrime = true;
		for(int i=2; i <= n/2; i++) {
			if(n % i == 0) {
				System.out.println(n+" is not prime, because it is divisible by "+i);
				isPrime = false;
				break;
			} 
		}
		if(isPrime)  {
			System.out.println(n+" is a prime number");
		} 
	}

}
