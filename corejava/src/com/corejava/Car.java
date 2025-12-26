package com.corejava;

public class Car {
	
	String brand_name ;
	int year;
	
	public Car (String brandname1 , int year1) {
		brand_name = brandname1;
		year = year1;
		
	}
	

	public static void main(String[] args) {
		Car y = new Car("venue",2025);
		System.out.println("Brand name = " + y.brand_name);
	}

}
