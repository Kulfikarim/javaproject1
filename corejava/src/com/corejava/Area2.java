package com.corejava;

import java.util.Scanner;

public class Area2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of a square :");
		double a = sc.nextDouble();
		double area = area(a);
		System.out.println("Area of square is :" + area);
		System.out.println("-------------------------");
		
		System.out.println("Enter length of rectangle :");
		double l = sc.nextDouble();
		System.out.println("Enter breadth of rectangle :");
		double b =sc.nextDouble();
		double area2 =area1(l,b);
		System.out.println("area of triangle is : " + area2);
		sc.close();

	}
	
	static double area(double side) {
		
		double area = side * side;
		return area;
	}
	static double area1(double length,double breadth) {
		double area = length * breadth;
		return area;
		
	}

}
