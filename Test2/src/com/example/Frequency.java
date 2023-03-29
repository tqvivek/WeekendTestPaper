package com.example;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		long number = sc.nextInt();

		System.out.println("Digit    Frequency");
		for (int i = 0; i <= 9; i++) {
			int count = 0;
			long temp = number;
			while (temp > 0) {
				long digit = temp % 10;
				if (digit == i) {
					count++;
				}
				temp = temp / 10;
			}
			if (count > 0) {
				System.out.println(i + "   " + count);
			}
		}

	}

}
