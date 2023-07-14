package com.vtseva.functions;

public class SumPrimeNumbers {

	public static void main(String[] args) {

		int result = 0;	
		int n = 2;
		// calculating prime
		while (n < 1000) {
			if(validatePrime(n)) {
				result += n;
			}
			n++;
		}
		System.out.println("Sum of all Prime numbers  :"+result);
	}
	
	public static boolean validatePrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				//System.out.println(n + " is not prime, because it is divisible by " + i);
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}

}
