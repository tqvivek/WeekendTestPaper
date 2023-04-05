//Q3. Write a program to reverse a number and print it
package com.examples;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int rev = 0;

		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;

		}
		System.out.println(rev);

	}

}
