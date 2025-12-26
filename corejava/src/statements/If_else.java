package statements;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();

		String mark = (marks >= 40) ? "pass" : "fail";
		System.out.println("The student is : " + mark);

	}

}
//1. A student passes an exam if the marks are greater than or equal to 40. Print "Pass" or "Fail" using the ternary operator.
//2.Write a Java program to check whether a student is eligible for a scholarship.
// Conditions:
// a)Attendance percentage must be greater than or equal to 75
// b)Exam score must be greater than or equal to 60

//       Requirements:
// a.Use the logical AND (&&) operator
// b.Print "Eligible for Scholarship" or "Not Eligible for Scholarship"