package com.example;

import java.util.Scanner;

public class CountryName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country name:");
		String name = sc.next();

		switch (name) {
		case "India":
			System.out.println("Pincode:" + 412209);
			System.out.println("Capital:" + "Delhi");
			System.out.println("Area:" + "50000sqft");
			break;
		case "Srilanka":
			System.out.println("Pincode:" + 412208);
			System.out.println("Capital:" + "Colombo");
			System.out.println("Area:" + "9000sqft");
			break;
		case "Australia":
			System.out.println("Pincode:" + 412207);
			System.out.println("Capital:" + "Sydney");
			System.out.println("Area:" + "70000sqft");
			break;
		case "Pakistan":
			System.out.println("Pincode:" + 412206);
			System.out.println("Capital:" + "Islamabad");
			System.out.println("Area:" + "800sqft");
			break;
		case "China":
			System.out.println("Pincode:" + 412205);
			System.out.println("Capital:" + "Beijing");
			System.out.println("Area:" + "400000sqft");
			break;

		default:
			System.out.println("Please enter correct input....");

		}

	}

}
