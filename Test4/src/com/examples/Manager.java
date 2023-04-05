package com.examples;

public class Manager implements Employee {
	double salary;

	public void incrementSalary() {
		this.salary = 20000;
		System.out.println("Manager Salary:" + (salary + 50000));
	}

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.incrementSalary();
	}

}
