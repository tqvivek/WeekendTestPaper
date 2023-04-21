package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringIntersection {

	public static String[] findCommonElements(String[] arr1, String[] arr2) {
		List<String> commonElements = new ArrayList<>();

		for (String element : arr1) {
			if (Arrays.asList(arr2).contains(element)) {
				commonElements.add(element.toLowerCase());
			}
		}

		return commonElements.toArray(new String[0]);
	}

	public static void main(String[] args) {
		String[] arr1 = { "Java", "C", "Python", "Oracle" };
		String[] arr2 = { "Angular", "SpringBoot", "Java", "SQL", "Oracle" };
		String[] result = findCommonElements(arr1, arr2);
		System.out.println(Arrays.toString(result));
	}

}
