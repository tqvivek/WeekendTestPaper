package com.demo;

public class MostRepWord {
	public static void mostRepWord(String str) {
		String[] words = str.split("\s");

		String mostRepWord = null;
		int maxCount = 0;
		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}
			if (count > maxCount) {
				mostRepWord = words[i];
				maxCount = count;

			}
		}
		System.out.println("Most repeated word is:" + mostRepWord);
	}

	public static void main(String[] args) {
		String str = "india is great country india is great";
		mostRepWord(str);
	}

}
