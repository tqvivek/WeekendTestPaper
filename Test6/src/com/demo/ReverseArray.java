package com.demo;

import java.util.Arrays;

public class ReverseArray {
	public static void reverse(int arr[]) {
		int n = arr.length;
		int mid = n / 2;

		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[mid - i - 1];
			arr[mid - i - 1] = temp;

		}
		for (int i = mid; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;

		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 7, 3, 4 };
		reverse(arr);

	}

}
