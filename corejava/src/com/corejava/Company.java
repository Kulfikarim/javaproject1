package com.corejava;

import java.util.Scanner;

public class Company {
	



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bonus : " );
		double bonus = sc.nextDouble();

		
		System.out.println("Enter basic salary : ");
		double basicSalary = sc.nextDouble();
		
		System.out.println("Enter deduction : ");
		double deduction = sc.nextDouble();
		
		System.out.println("Enter total working days : ");
		double totalWorkingDays = sc.nextDouble();
		
		
		System.out.println("Enter Days worked : ");
		double DaysWorked = sc.nextDouble();
		
		
		
		
		double grossSalary = basicSalary + bonus;
		double netSalary = grossSalary - deduction;
		double perDaySalary1 = basicSalary / totalWorkingDays;
		double earnedSalary = perDaySalary1 * DaysWorked;
		double remainingDays = totalWorkingDays % DaysWorked;
		System.out.println("Gross salary : " + grossSalary);
		System.out.println("net salary : " + netSalary);
		System.out.println("perday salary : " + perDaySalary1);
		System.out.println("earned salary : " + earnedSalary);
		System.out.println("remaining days : " + remainingDays);
		
		
	

	}

}
