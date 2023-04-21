// Write a program to find most repeated word in a string
package com.demo;

public class MostRepeatedWordInString {
	public static void countMostRepeatedWord(String s) {
		String[] word = s.split(" ");
		int count;
		for (int i = 0; i < word.length; i++) {
			count = 1;
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equals(word[j])) {
					count++;
					word[j] = "0";
				}
			}
			if (word[i] != "0") {
				System.out.println(word[i] + "  " + count);
			}

		}
	}

	public static void main(String[] args) {
		String s = "india is great country india is great";
		countMostRepeatedWord(s);

	}

}
