package com.demo;

public class CricketerTest {
	public static void main(String[] args) {

		Cricketer c1 = new Cricketer();
		c1.setPlayerid(07);
		c1.setName("Dhoni");
		c1.setStrikrate(220);
		c1.setRun(909);

		System.out.println(c1.toString());

	}

}
