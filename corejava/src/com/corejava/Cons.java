package com.corejava;

public class Cons {
	
	int empid;
	String empname;
	double sal;
	
	Cons(int emp,String name){
		System.out.println("emp id : " + emp);
		System.out.println("emp name : " + name);
		System.out.println("emp salary : " +sal);
		
	}

	Cons(int empid,String empname,double sal){
		
	
		System.out.println("emp id : " + empid);
		System.out.println("emp name : " + empname);
		System.out.println("emp salary : " +sal);
		
	}
	public static void main(String[] args) {
	
		Cons c = new Cons(1,"hari");
		Cons d = new Cons(2,"srikanth",10000.00);
		

	}

}
