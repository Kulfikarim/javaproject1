package com.logicalstatements;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Attendance percentage : ");
		int attendance = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Exam score : ");
		int exam_score = sc1.nextInt();
		
		if(attendance >= 75 && exam_score >= 60) {
			System.out.println("Eligible for scholarship");
		}
		else {
			System.out.println("Not eligible for scholarship");
		}
		sc.close();
		

	

	}


}
//Write a Java program to check whether a student is eligible for a scholarship.
//Conditions:
//a)Attendance percentage must be greater than or equal to 75
//b)Exam score must be greater than or equal to 60

//    Requirements:
//a.Use the logical AND (&&) operator
//b.Print "Eligible for Scholarship" or "Not Eligible for Scholarship"