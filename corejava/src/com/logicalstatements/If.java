package com.logicalstatements;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		System.out.println("Naukri profile meet creteria!!!!!!!!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of th exam : ");
		int i = sc.nextInt();
	
		System.out.println("Enter age of the student : ");
		int j = sc.nextInt();
	
		
		if ( i>35) {
			System.out.println("just pass the exam....");
			if(j > 18) {
				System.out.println("you are eligible for voting...");
			}
			else {
				System.out.println("you are not eligible for voting...");
			}
		}else {
			System.out.println("Fail the exam...");
		}
		sc.close();

	}

}
