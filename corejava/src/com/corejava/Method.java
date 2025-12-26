package com.corejava;

import java.util.Scanner;

public class Method {
	
	static void studentname(String fname,String lname) {
		
		System.out.println("your name is : " + fname + " " + lname);
	}
	
	static void age(byte age) {
		
	     System.out.println("your age is : " + age);
	}
	
	static void phone(long phone) {
		
	     System.out.println("your phone is : " + phone);
	}
	
	static void gender(char c) {
		
	     System.out.println("your gender is : " + c);
	}
	
	static void salary(double salary) {
		
	     System.out.println("your salary is : " + salary);
	}
	static void bool(boolean bool) {
	System.out.println("Are you male : " + bool);
	}

	public static void main(String[] args) {
		
 
     
    
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter your First name :");
     
     String nm = sc.next();
     System.out.println("Enter your Last name :");
     String ln = sc.nextLine();
     System.out.println("Enter your age :");
     byte age =sc.nextByte();
     
     System.out.println("Enter your phone :");
     long phone =sc.nextLong();
     System.out.println("Enter your gender :");
     char c = sc.next().charAt(0);
     
     System.out.println("Enter your salary :");
     double salry =sc.nextDouble();
     
     System.out.println("are you male female if male then enter true else false : ");
     boolean bool = sc.hasNextBoolean();
     
     
     studentname(nm,ln);
     age(age);
     phone(phone);
     gender(c);
     salary(salry);
     bool(bool);
      sc.close();
	}

}
