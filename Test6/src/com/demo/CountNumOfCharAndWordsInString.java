package com.demo;

public class CountNumOfCharAndWordsInString {
	public static void countCharacters(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Count of characters:" + count);
	}

	public static void countWord(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
				count++;
			}
		}
		System.out.println("Number of words in a string:" + count);
	}

	public static void main(String[] args) {
		String str = "Learn Java";
		System.out.println(str);
		System.out.println("Length Of String:" + str.length());

		countCharacters(str);
		countWord(str);

	}

}
