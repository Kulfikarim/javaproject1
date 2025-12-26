package com.corejava;

public class Literals {
	
	
	
	

	public static void main(String[] args) {
	
		//1. BMI Calculator Using Type Casting
		//Write a Java program to calculate BMI using the formula:
		//BMI = Weight/ (height) ^2
		//Conditions:
		//Take weight as a double
		//Take height as a double.Calculate BMI and convert the final result to int using type casting
	
		double weight = 68;
		double height = 5.7;
		double BMI = weight/(height * height);
		
		int value =(int)BMI;
		
		
        System.out.println(value);
	}

}
