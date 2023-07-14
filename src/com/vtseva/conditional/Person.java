package com.vtseva.conditional;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner scannerSiva = new Scanner(System.in);
		System.out.println("Enter age:");
		String age = scannerSiva.next();
		System.out.print("the age entered :"+age);
//		int age = 45;
//		System.out.println("Age from command line, Name :"+args[0]+" Age:"+args[1]);
		scannerSiva.close();
	}

}
