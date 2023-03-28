package com.example;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student s1 = new Student();
		System.out.println("Enter the 1st student details:");
		System.out.println("Enter the student ID:");
		s1.setId(sc.nextInt());
		System.out.println("Enter the student name:");
		s1.setName(sc.next());
		System.out.println("Entre the student marks:");
		s1.setMarks(sc.nextDouble());

		// System.out.println(s1.toString());

		Student s2 = new Student();
		System.out.println("Enter the 2nd student details:");
		System.out.println("Enter the student ID:");
		s2.setId(sc.nextInt());
		System.out.println("Enter the student name:");
		s2.setName(sc.next());
		System.out.println("Entre the student marks:");
		s2.setMarks(sc.nextDouble());

		// System.out.println(s2.toString());

		Student s3 = new Student();
		System.out.println("Enter the 3rd student details:");
		System.out.println("Enter the student ID:");
		s3.setId(sc.nextInt());
		System.out.println("Enter the student name:");
		s3.setName(sc.next());
		System.out.println("Entre the student marks:");
		s3.setMarks(sc.nextDouble());

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

	}

}
