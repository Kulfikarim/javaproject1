package com.constructors.corejava;

 class Dog {
	
	int accno;
	String name;
	int balance;
	

	Dog(int accno){
		this.accno= accno;
	}

	
	Dog(int accno,String name){
		this(accno);
		this.name = name;
	}
	Dog(int accno,String name,int balance){
		this(accno,name);
		this.balance= balance;
	}
	
}


class Cat extends Dog{
	
	Cat(int accno,String name,int balance){
		super(accno,name,balance);
	}
	
	public static void main(String[] args) {
		
		Cat c =  new Cat(101010,"karim",50000);
		c.display();
	}
	
	void display() {
		System.out.println(accno + "      " + name + "       " + balance);
	}
}
