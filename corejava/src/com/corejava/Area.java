package com.corejava;

import java.util.Scanner;

public class Area {


 void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base of triangle :  ");
         double b = sc.nextDouble();
         System.out.println("Enter height of trianle :");
         double h = sc.nextDouble();
         double area =  Areatriangle(b,h);
         System.out.println("Area of triangle is :" + area);
         
         sc.close();
         
	}

	double Areatriangle(double base,double height) {
		
		double area =0.5 * base * height;
		return area;
	}
	
}
