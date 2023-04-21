package com.demo;

public class PrintFirst15Num {

	public static void main(String[] args) {
		int n = 15;
		int a = 0, b = 1, c;
		System.out.print(a + ", " + b);
		for (int i = 2; i < n; i++) {
			c = 2 * b + a;
			System.out.print(", " + c);
			a = b;
			b = c;
		}
	}

}
