package com.corejava;

public class Method1 {
	
	
	static int currentbalance = 1000;
	void deposit() {
		
		
		int amount = 500;
		currentbalance = currentbalance + amount;
		System.out.println(currentbalance);
		
	}
	
	void withdrawl(int amount) {
		
		
		currentbalance = currentbalance - amount;
		System.out.println(currentbalance);
		
	}
	
	void getcurrentbalance() {
		
		int currentbalance ;
		
		
		System.out.println(currentbalance);
		
		
	}

	public static void main(String[] args) {
	
		Method1 m = new Method1();
		
		m.deposit();
		m.withdrawl(1000);
		m. getcurrentbalance();
		System.out.println();

	}

}
