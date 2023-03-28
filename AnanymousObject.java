package com.example;

public class AnanymousObject {

	private int id;
	private String name;
	private int marks;

	public AnanymousObject() {
		System.out.println("I am default counstructor.");
		this.id = 13;
		this.name = "sahil";
	}

	public AnanymousObject(int id, String name, int marks) {
		System.out.println("I am parameterized constructor...");
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public void display() {
		System.out.println("Datails are=>  " + "id=" + id + " name=" + name + " marks=" + marks);
	}

	public static void main(String[] args) {

		new AnanymousObject().display();
		new AnanymousObject(12, "vivek", 98).display();
	}

}
