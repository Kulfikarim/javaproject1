package com.corejava;

public class Bank {

	static String companyname = "vcube";
	static int insurance_fee = 500;
	static int amount = 1500;

	static void welcome() {

		System.out.println("welcome :" + companyname);

	}

	static int dailyrate() {

		System.out.println("amount : " + amount);
		return amount;

	}

	static int insurance() {

		System.out.println("insurance :" + insurance_fee);
		return insurance_fee;

	}

	static int baseamount(int days) {

		System.out.println("days :" + days);

		return dailyrate() * days;
	}

	static int totalamount(int days) {

		return baseamount(days) + insurance();

	}

	public static void main(String[] args) {

		welcome();

		System.out.println(totalamount(12));

	}

}
