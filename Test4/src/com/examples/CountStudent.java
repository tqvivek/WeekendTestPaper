//10. Write a program to count the number of student registered in a school.
package com.examples;

public class CountStudent {

	private int sid;
	private String name;

	static int studCount = 0;

	{
		studCount++;
	}

	public CountStudent() {

	}

	public CountStudent(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getStudCount() {
		return studCount;
	}

	public static void setStudCount(int studCount) {
		CountStudent.studCount = studCount;
	}

}
