//Q1. Write a program to display the number divisible by 3 from 1 to n numbers.
package com.examples;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				i++;
			}

		}
	}

}
