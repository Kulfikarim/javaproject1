package com.corejava;

public class Wrapper {

	public static void main(String[] args) {
	    
		int a = 5;
		Integer a2 = a;
		System.out.println(a2);
	
	Integer a3 = new Integer(5);
	int a4 = a3;
	System.out.println(a4);
	
	
	
	int h = 0xabc;
	int m= 0123;
	
	 System.out.println("hexaoctal = " + m);
	
	
	char c = 'f';
	Character t = c;

    
	 System.out.println(c);
	 System.out.println(t);
	 
	 
	 boolean b = true;
	 
	 Boolean tr = b;
	 System.out.println(b);
	 System.out.println(tr);
	 
	 byte e = 50;
	 Byte g =  e;
	System.out.println(e + g);
	
	
	
	}

}
