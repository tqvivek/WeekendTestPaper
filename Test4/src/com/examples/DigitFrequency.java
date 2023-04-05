//Q4. Write a program to count the frequency of digit in a number
package com.examples;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Digit\tFrequency");

		int count, digit, temp;
		for (int i = 0; i <= 9; i++) {
			count = 0;
			temp = n;
			while (temp > 0) {
				digit = temp % 10;
				if (digit == i) {
					count++;
				}
				temp /= 10;
			}
			if (count > 0) {
				System.out.println(i + "\t" + count);
			}

		}
	}

}
