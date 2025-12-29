package com.logicalstatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		
		System.out.println("Main Method Started!!!!!!!");
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number to find a day : ");
		int i = sc.nextInt();

		switch(i) {
		case 1 -> System.out.println("The day is Sunday....");
		case 2 -> System.out.println("The day is Monday...");
		case 3 -> System.out.println("The day is Tuesday....");
		case 4 -> System.out.println("The day is Wednesday... ");
		case 5 -> System.out.println("The day is Thursday...");
		case 6 -> System.out.println("The day is Friday...");
		case 7 -> System.out.println("The day is Saturay....");
		default -> System.out.println("Number is out of bounds...........");
			
		}
		sc.close();
	}

}
