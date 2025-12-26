package com.corejava;

public class Cricketer {
	
	int jno;
	String jname;
	
	static int countryid=91;
	static String countryname="India";

	public static void main(String[] args) {
		System.out.println("Indian Cricket Team");
		Cricketer vk = new Cricketer();
		
	
		
		vk.jno=18;
		vk.jname="virat kohli";
		System.out.println("countryid:" + countryid);
		System.out.println("countryname:" + countryname);
		System.out.println("jersey number:" + vk.jno);
		System.out.println("cricketer name:" + vk.jname);
        
		Cricketer kl = new Cricketer();
		
		
		
		kl.jno=1;
		vk.jname="Lokesh Rahul";
		System.out.println("countryid:" + countryid);
		System.out.println("countryname:" + countryname);
		System.out.println("jersey number:" + kl.jno);
		System.out.println("cricketer name:" + vk.jname);

	}

}
