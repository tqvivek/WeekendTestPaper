package com.example;

public class Student {
	private int id;
	private String name;
	private double marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double d) {
		this.marks = d;
	}

	public String toString() {
		return "Students Details-->Id:" + id + "\t Name:" + name + "\tMarks:" + marks;
	}

}
