package com.corejava;

public class Method3 {
	
	
	
	static void add(int x ,int y) {
		
		
		int c = x+y;
		
		System.out.println("addition is :" + c);
		sub(c,4);
	}

	
	static void sub(int c,int z) {
		
		int a = c-z;
		
		System.out.println("subtraction is :" + a);
		mul(a,3);
	}
	
	
	
	static void mul(int a,int b) {
		
		int d = a*b;
		System.out.println("multiplication is :" + d);
	}
	
	 
	public static void main(String[] args) {
		
	add(5,5);
		
		

	}

}
