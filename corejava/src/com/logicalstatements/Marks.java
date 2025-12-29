package com.logicalstatements;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int i = sc.nextInt();
		
		 String j=  (i < 0 || i > 100) ? "Invalid Marks":
			       (i > 90 && i<=100) ? "A Grade " :
			       (i >= 80 && i<90) ? "B Grade ":
			    	   (i >= 70 &&   i<80 ) ? "c Grade ":
			    	   (i >= 60 && i<70) ? "D Grade ":
			    	   (i >= 35 && i < 60) ? "E Grade ":
			    	  
			    				"fail";
		 System.out.println("Result is :" + j );
		 sc.close();
	}

}
