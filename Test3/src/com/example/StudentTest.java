package com.example;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student(12, "Vivek", 36, 87);
		Student s2 = new Student(13, "Sahil", 54, 97);

		System.out.println(s1);
		System.out.println(s2);

		System.out.println("The total student are ragistered:" + Student.counter);

	}

}
