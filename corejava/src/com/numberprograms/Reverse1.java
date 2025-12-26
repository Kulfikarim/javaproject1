package com.numberprograms;

import java.util.Scanner;

public class Reverse1 {

	public static void main(String[] args) {
	System.out.println("Enter a number:");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int rev =0,temp = n,lastdigit = 0;
			
	while(temp!=0)
	{
		lastdigit = temp%10;
	rev = rev*10 + lastdigit;
	temp = temp/10;
	}
if (n==rev)
	System.out.println("it is a palindrome");
else
	System.out.println("it is  not a palindrome");
	}

}
