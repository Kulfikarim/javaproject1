package com.corejava;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
	System.out.println("Enter a number:");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(n % 2 == 0)
		System.out.println("It is a prime number!!!!!!!");
	else
		System.out.println("It is not a prime number!!!!!! ");
    }
}
