package com.corejava;

public class Movie {
	
	static int count=0;
	
	 Movie() {
		count ++;
	
	}
	

	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		Movie movie3 = new Movie();
		Movie movie4 = new Movie();
		
		  
       System.out.println("Number of movies created:" + count);
    

	}

}
