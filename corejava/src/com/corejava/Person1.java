package com.corejava;


class Person1 {
	
	String name;
	
	Person1(){
		
	}
	Person1(String name){
		
		this.name = name;
		System.out.println("One arg parameterized constructor called");
	}
	
	

	public static void main(String[] args) {
	}

}
class Employee extends Person1{
	 
	 int sal;
	 int id;
	 
	 Employee(int sal,int id){
		 
		 super("Karim");
		 this.sal = sal;
		 this.id = id;
		
		 
	 }
	 
	public static void main(String[] args) {
		
		Employee e =  new Employee(20000,101);
		
		e.show();
	}
	
	void show() {
		System.out.println("Employee name : " + name);
		System.out.println("Empoyee salary : " + sal);
		System.out.println("Employee id : " + id);
	}
	 
	 
	
}
