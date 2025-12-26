package com.constructors;

public class ConstructorDemo {
	int sno;
	String name;

//
	public ConstructorDemo(int sno, String name) {
		sno = sno;
		name = name;
	}

	public ConstructorDemo() {
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println(sno + " " + name);
	}

	public static void main(String[] args) {

		ConstructorDemo d = new ConstructorDemo();
	}
}
