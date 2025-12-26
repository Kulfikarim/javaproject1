package com.constructors.corejava;

public class Bus {
	
	String name;
	
	
	Bus (String name){
		this.name = name;
	}

	

}
 class Lorry extends Bus{
	 
	 
	 int id;
	 int sal;
	 
	 Lorry(String name,int id,int sal){
		super(name);
		 this.id = id;
		 this.sal = sal;
		 
	 }
	 public static void main(String[] args) {
		Lorry l = new Lorry( "karim",101, 20000);
		l.show();
	}
	
	 void show() {
		 System.out.println("name : " + name);
		 System.out.println("id : " + id);
		 System.out.println("sal : " + sal);
	 }
	
}
