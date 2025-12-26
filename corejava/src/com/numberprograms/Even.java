package com.numberprograms;

import java.util.Scanner;

public class Even {
	
	
	

	public static void main(String[] args) {
	
	System.out.println("Enter a number:");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	boolean isprime = true;
	
	for (int i = 2; i<n; i++) {
		if(n % i == 0) {
			isprime = false;
			break;
		}
	}
	if(isprime)
		System.out.println("It is a prime number!!!!!!");
	else
		System.out.println("It is not a prime number!!!!!!!!!");
    


	}

}
