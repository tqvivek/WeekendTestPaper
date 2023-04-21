//Q3. Write a program to check the string is anagram or not.
package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void checkAnagram(String s1, String s2) {
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();

		if (c1.length != c2.length) {
			System.out.println("Not Anagram");
			System.exit(0);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);

		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i]) {
				System.out.println("Not Anagram");
				System.exit(0);
			}
		}
		System.out.println("Anagram");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string:");
		String s1 = sc.next();
		System.out.println("Enter 2nd String:");
		String s2 = sc.next();

		checkAnagram(s1, s2);

	}
}
