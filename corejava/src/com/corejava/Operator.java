package com.corejava;

public class Operator {

	public static void main(String[] args) {
	int p = 3;
	      int q = 6;
	      int r = p++ + --q + ++p + q--;
	    int a = 5;
	      int b = ++a + a++ + --a;
       System.out.println(r);
       System.out.println(b);
	}

}
