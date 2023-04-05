//Q2. Write a program to check the number is prime or not
package com.examples;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		boolean flag = true;

		if (n == 0 || n == 1) {
			System.out.println("Not prime number");
		} else
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					System.out.println(n + "not prime number");
					flag = false;
					break;

				}
			}
		if (flag) {
			System.out.println(n + "is prime number");
		}
	}

}
