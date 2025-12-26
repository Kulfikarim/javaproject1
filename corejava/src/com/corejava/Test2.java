package com.corejava;

public class Test2 {
	static int a = 10;
      int b= 20;
      
      
      static {
    	  a=a+5;
    	  System.out.println(a);
      }
      {
    	  b=b+5;
    	  System.out.println(b);
      }
	public static void main(String[] args) {
	
		new Test2();
		new Test2();

	}

}
