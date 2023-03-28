/*Q5. Write a java program to create a class Employee(id, name, salary, age, experience) . Create 3 constructors as 
	Default 
	Constructor1(take experience as 0)
	Constructor2(taking all fields)
Create a Employee test class in a separate package and create 4 objects of employee and then print them
********/
package com.example;

public class Employee {
	private int id;
	private String name;
	private String salary;
	private int age;
	private int experience;

	public Employee() {
		// Default Constructor.....
	}

	public Employee(int id, String name, String salary, int age) {
		System.out.println("Constructor 1");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.experience = 0;
	}

	public Employee(int id, String name, String salary, int age, int experience) {
		System.out.println("Constructor 2");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.experience = experience;
	}

	public String toString() {
		return "Employee information--->>" + "Emp Id:" + id + "Emp Name:" + name + "Emp Salary:" + salary
				+ "Emp Experience:" + experience + "Emp age:" + age;
	}

}
