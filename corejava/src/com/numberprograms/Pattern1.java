package com.numberprograms;

public class Pattern1 {

	public static void main(String[] args) {
	int n= 5;
	for(int i =1; i<=5; i++) {
		for (int s=1; s<=n-i; s++) {
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
