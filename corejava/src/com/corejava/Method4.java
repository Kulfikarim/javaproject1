package com.corejava;

import java.util.Scanner;

public class Method4 {

	static int string(char cha) {

		return (int) cha;

	}

	static char string(int a) {
		return (char) a;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string character :");
		char c = sc.next().charAt(0);
		int num = string(c);

		System.out.println("your ascii value is :" + num);

		System.out.println("Enter a number :");
		int i = sc.nextInt();
		char c1 = string(i);
		System.out.println("your character is  :" + c1);
		sc.close();
	}

}
