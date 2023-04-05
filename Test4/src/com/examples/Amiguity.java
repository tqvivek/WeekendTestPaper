//Write a program to show ambiguity in method overloading
package com.examples;

public class Amiguity {

	static void showAdd(int a, int b) {
		System.out.println("Int-Int method");
	}

	static void showAdd(float c, int d) {
		System.out.println("float -int method");
	}

	static void showAdd(int e, float f) {
		System.out.println("int -float method");
	}

	public static void main(String[] args) {
		showAdd();
	}

}
