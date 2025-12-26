package com.corejava;

public class Method2 {
	
	
	
	int add() {
		
		int a,b;
		a=10;
		b=20;
		return a+b;
		
	}

	public static void main(String[] args) {
    
		
		Method2 m = new Method2();
		int total;
		total = m.add();
		System.out.println(total);

	}

}
