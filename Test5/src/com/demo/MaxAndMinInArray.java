package com.demo;

public class MaxAndMinInArray {
	public static int max(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}

	public static void main(String[] args) {
		int[] myarr = { 23, 92, 56, 39, 93 };
		System.out.println("Maximum Number:" + max(myarr));
		System.out.println("Minimum Number:" + min(myarr));

	}

}
