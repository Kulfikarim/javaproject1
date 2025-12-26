package com.corejava;

public class Method34 {
	
	int add(int x,int y) {
		
		int sum =  x+y;
		return sum;

	}
	
	int sub(int x,int y) {
		
		
		int sub1 = x-y;
		return sub1;
	}
	
	int mul(int x,int y) {
		
		int mul1 = x*y;
		return mul1;
		
	}

	public static void main(String[] args) {
		
		Method34 m  = new Method34();
		
		int result = m.add(4, 5);
		System.out.println("Adddition is :" + result);

	}

}
