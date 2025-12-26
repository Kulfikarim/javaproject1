package com.corejava;

public class Add {

	public static void main(String[] args) {
		// Write a Java program to perform addition,
		// subtraction, multiplication, and division using 
		// int, byte, and short values.
		
		
		int i1=20 ,i2=10;
		int a = i1 + i2;
		System.out.println("Addition is = " + a);
		System.out.println("Subtraction is = " + (i1-i2));
		System.out.println("Multiplication is = " + (i1*i2));
		System.out.println("Division is = " + (i1/i2));
		
		
		
		byte b1 = 10 ,b2 = 50;
		byte c=(byte) (b1+b2);
		byte d= (byte) (b1-b2);
		System.out.println("Addition is = " + c);
		System.out.println("Subtraction is = " + d);
		System.out.println("Multiplication is = " + (b1*i2));
		System.out.println("Division is = " + (b1/i2));
        
		
		short s1 = 300,s2 = 200;
		System.out.println("Addition is = " + (s1+s2));
		System.out.println("Subtraction is = " + (s1-s2));
		System.out.println("Multiplication is = " + (s1*b2));
		System.out.println("Division is = " + (s1/s2));
	}

}
