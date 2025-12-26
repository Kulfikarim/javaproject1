package com.corejava;

import java.util.Scanner;

public class Area1 {

	public static void main(String[] args) {
         
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle : ");
		double a = sc.nextDouble();
		double area =area(a);
		System.out.println("Radius of the circle is : " + area);
sc.close();
	}

	
	static double area(double radius) {
		
		double area = Math.PI*radius*radius;
		return area;
	}
}
