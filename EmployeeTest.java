package com.test;

import java.util.Scanner;

import com.example.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Displaying 1st Employee Information....");
		Employee e1 = new Employee();
		System.out.println(e1.toString());

		System.out.println("---------------------------------------------------");

		System.out.println("Displaying 2nd Employee Information...");
		Employee e2 = new Employee(1, "Vivek", "50000", 5);
		System.out.println(e2.toString());

		System.out.println("---------------------------------------");

		System.out.println("Displaying 3rd Employee Information...");
		Employee e3 = new Employee(2, "Sachin", "70000", 45, 18);
		System.out.println(e3.toString());

	}

}
