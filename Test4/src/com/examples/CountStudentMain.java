package com.examples;

public class CountStudentMain {

	public static void main(String[] args) {

		System.out.println("Num of Students:" + CountStudent.studCount);
		CountStudent s1 = new CountStudent(1, "Vivek");
		CountStudent s2 = new CountStudent(2, "Omkar");
		CountStudent s3 = new CountStudent(3, "Suyog");
		CountStudent s4 = new CountStudent(4, "Pratik");

		System.out.println("Num of Students:" + CountStudent.studCount);

	}

}
