package com.constructors;

public class One {
	
	int id;
	int sal;
	String name;
	
	One(){
		this(1);
		
	}
	
	One(int id){
		this(id,234);
		this.id = id;
		
		
	
	}
	One (int id,int sal){
		this(id,sal,"karim");
		this.sal=sal;
		
	}
	One(int id ,int sal, String name){
		this.name = name;
		
	}

	public static void main(String[] args) {
		
		One o = new One();
		o.show();
		
		


	}
	void show() {
		System.out.println("id number : " + id);
		System.out.println("sal number : " + sal);
		System.out.println("name : " + name);
	}

}
