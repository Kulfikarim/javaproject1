package com.corejava;

import java.util.Scanner;

public class Bank2 {
	static double balance = 5000;
	
double checkbalance() {
	System.out.println("your balance is :" + balance);
	return balance;
}
	double deposit(double deposit) {
		
		 balance = balance + deposit;
		System.out.println("Deposited successfully :" + deposit);
		return balance;
	}
	
	double withdraw(double amount) {
		
	 balance = (balance - amount);
		
		System.out.println("withdrawl successfully!!" + amount);
		return amount;
	}
	

	public static void main(String[] args) {
    
		Bank2 b = new Bank2();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Deposited money :" );
		double deposit = sc.nextDouble();
		b.deposit(deposit);
		b.checkbalance();
		System.out.println("---------------------------------");
	
		 System.out.println("Enter withdrawal amount :");
		 double withdrwal = sc.nextDouble();
	    b.withdraw(withdrwal);
	    b.checkbalance();

		
	}

}
