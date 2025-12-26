package com.corejava;

import java.util.Scanner;

public class Return {
	
	static double salary(double salary) {
	
	
	return salary;
	
	}
	
	static double bonus(double bonus) {
		return bonus;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter salary :");
		double sal = sc.nextDouble();
		System.out.println("Enter your bonus :");
		double bonus = sc.nextDouble();
      salary(sal);
      bonus(bonus);
      System.out.println("Total salary is : " + (sal+bonus));
	}

}
