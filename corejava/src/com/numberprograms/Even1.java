package com.numberprograms;

import java.util.Scanner;

public class Even1 {
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter a number to check the given number is even or odd : ");
		Scanner sc =  new Scanner(System.in);
		int i = sc.nextInt();
		
		if (i != 0 && i % 2 ==0) {
			System.out.println("It is a even number");
			
		}
	
		
		else {
			System.out.println("It is a odd number");
		}
	}

}
