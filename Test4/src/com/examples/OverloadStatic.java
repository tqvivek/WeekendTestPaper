package com.examples;

public class OverloadStatic {

	public static void display() {
		System.out.println("Static method called:");
	}

	public static void display(int x) {
		System.out.println("An overlaoded static method called:");
	}

	public static void main(String[] args) {

		OverloadStatic.display();
		OverloadStatic.display(67);

	}
}
