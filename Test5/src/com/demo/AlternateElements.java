package com.demo;

public class AlternateElements {
	public static void printAlternateElements(int[] arr1, int[] arr2) {
		int i = 0, j = 0;

		while (i < arr1.length && j < arr2.length) {
			System.out.print(arr1[i] + " ");
			System.out.print(arr2[j] + " ");
			i++;
			j++;
		}

		while (i < arr1.length) {
			System.out.print(arr1[i] + " ");
			i++;
		}

		while (j < arr2.length) {
			System.out.print(arr2[j] + " ");
			j++;
		}

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9, 12 };
		int[] arr2 = { 2, 4, 6, 8, 10, 44 };

		printAlternateElements(arr1, arr2);
	}

}
