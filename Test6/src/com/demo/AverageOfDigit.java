//Q7. Write a program to find average of digits in a given number. 
//If user enters 125 ,average of 1 , 2 and 5 is 2.6 . If user enters 6172 average is 4
package com.demo;

import java.util.Scanner;

public class AverageOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String num = sc.next();

		int sum = 0;
		int count = 0;
		for (int i = 0; i < num.length(); i++) {
			char digit = num.charAt(i);
			if (Character.isDigit(digit)) {
				sum += Integer.parseInt(String.valueOf(digit));
				count++;
			}
		}
		float average = (float) (sum / count);
		System.out.printf("The average of digits is:" + average);
	}
}
