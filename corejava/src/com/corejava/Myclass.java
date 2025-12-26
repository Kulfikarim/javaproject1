package com.corejava;

class Myclass {

	int id;
	String name;
	int sal;

	Myclass() {
		System.out.println("No  arg construcor called");

	}
	


	Myclass(int id, int sal) {
		this.id = id;
		this.sal = sal;
		System.out.println("two arg constructor called");

	}

	public static void main(String[] args) {

	}

}

class Yourclass extends Myclass {

	Yourclass() {
		super(101, 20000);
		System.out.println("your");

	}

	public static void main(String[] args) {

		Yourclass y = new Yourclass();

		y.show();
	}

	public void show() {
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("sal = " + sal);
	}

}
