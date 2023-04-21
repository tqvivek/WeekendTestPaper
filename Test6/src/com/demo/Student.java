package com.demo;

public class Student extends Person {

	private int[] testScores;

	public Student(String firstname, String lastname, int id, int[] testScores) {
		super(firstname, lastname, id);
		this.testScores = testScores;
	}

	public char calculate() {
		int sum = 0;
		for (int score : testScores) {
			sum += score;
		}
		int average = sum / testScores.length;

		if (average >= 90 && average <= 100) {
			return 'O';
		} else if (average >= 80 && average < 90) {
			return 'E';
		} else if (average >= 70 && average < 80) {
			return 'A';
		} else if (average >= 55 && average < 70) {
			return 'P';
		} else if (average >= 40 && average < 55) {
			return 'D';
		} else {
			return 'T';
		}
	}

	public static void main(String[] args) {
		int[] scores = { 90, 85, 92, 78, 86 };
		Student student = new Student("Vivek", "Dange", 1, scores);
		char grade = student.calculate();
		System.out.println("Grade: " + grade);
	}

}
