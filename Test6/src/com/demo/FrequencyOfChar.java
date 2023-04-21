
//Q1. Write a program to find the frequency of characters in a string.
package com.demo;

public class FrequencyOfChar {

	public static void countFrequency(String s) {
		System.out.println("Character\tFrequency");
		String s1 = s.toLowerCase();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int ct = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s1.charAt(i))
					ct++;
			}
			if (ct != 0)
				System.out.println(ch + "\t\t" + ct);
		}

	}

	public static void main(String[] args) {
		String s = "Vivek Dasharath Dange";
		countFrequency(s);

	}

}
