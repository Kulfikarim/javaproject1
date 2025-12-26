package com.corejava;

public class Gc1 {
	 int x = 253;
		
	 int hundreds = x/100;
	 int tens = (x/10)%10;
	 int ones =  x%10;
	
	

public static void main(String []args) {

		Gc1 t = new Gc1();
		
		System.out.println("Hunders = " + t.hundreds);
		System.out.println("Tens = " + t.tens);
		System.out.println("Ones = " + t.ones);

	}

}
