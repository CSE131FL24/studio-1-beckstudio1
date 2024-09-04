package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("First of two integers to be averaged: ");
		int a = in.nextInt();
		System.out.println("Second of two integers to be averaged: ");
		int b = in.nextInt();
		System.out.println("Average of " + a + " and " + b + " is " + ((a+b)/2));
	}

}
