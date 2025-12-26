package com.corejava;

public class E {
static {
	System.out.println("hello");
}
void m(){
	System.out.println("this instance method1");
}
void m1(){
	System.out.println("this is method2 ");
}
static void ms(){
	E e=new E();
	e.m();
	e.m1();
	ms1();
	System.out.println("this is static2");
}
static void ms1(){
	System.out.println("this is static2");
}

{
	System.out.println("hello vcube");
}

	public static void main(String[] args) {
		
		ms();

	}

}
