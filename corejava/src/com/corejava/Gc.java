package com.corejava;

public class Gc {
	
public void finalize() {
	System.out.println("Destroyed objects");
}
static void m1() {
	 Gc obj2 = new Gc();
}
	public static void main(String[] args) {

		Gc animal = new Gc();
		animal=null;//nullfing
		Gc doctor = new Gc();
		Gc obj3 = new Gc();
		obj3 = doctor;	//reassigning	
	    new Gc();//anynomues
	   m1();//object within method
	    
		System.gc();
	}

}
