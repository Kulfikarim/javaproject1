package com.corejava;

public class user {

	
		
	static int user_have = 450;
		static int chocolate_cost = 15;
	static	int cookies_cost = 10;
		
	static	int chocolates_bought = 10;
		static int cookies_bought = 5;
		
	static	int user_bought = (chocolate_cost * chocolates_bought) + (cookies_cost * cookies_bought);
		
  static int remaining_money = user_have - user_bought ;
        
		public static void main(String[] args) {
			
			System.out.println("Remainingmoney = " + remaining_money);
			
		}

}
