package com.corejava;

public class Animal {
	
	String animalname;
	String animalsound;
	int animallegs;
	
	static String Forestname="Safari";

	public static void main(String[] args) {
		System.out.println("*********Aniaml sounds Information********");
		
Animal dog = new Animal();
		dog.animalname="dog";
dog.animalsound="bow bow";
dog.animallegs=4;
System.out.println("Animal Name:" + dog.animalname);
System.out.println("Animal sound:" + dog.animalsound);
System.out.println("Animal legs:" + dog.animallegs);
	}

}
