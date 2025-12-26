package com.constructors.corejava;

public class Employee {
	
	int empid;
	String name;
	double salary;
	static String companyname ;
	
	Employee(int empid,String name,double salary){
		
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	Employee(Employee e,double sal){
		
		this.empid = e.empid;
		this.name = e.name;
		this.salary = sal;
		
		
	}

	public static void main(String[] args) {
		
		
		Employee.companyname = "Vcube";
		Employee e = new Employee(101,"karim",2000.00);
		Employee e1 = new  Employee(e,234555.00);
		
		e.show();
		e1.show();
	
	

	}

	void show() {
		System.out.println("Employee id : " + empid);
		System.out.println("Employee name : " + name);
		System.out.println("Employee salary : " + salary);
		System.out.println("Company name : " + companyname);
	}
}
