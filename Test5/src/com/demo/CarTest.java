package com.demo;

public class CarTest {
	public static void main(String[] args) {
		Engine e1 = new Engine("v6", 55000);
		Machine m1 = new Machine("Jport", e1);
		Car c1 = new Car(1234, m1);

		Engine e2 = new Engine("V8", 78000);
		Machine m2 = new Machine("Luxury ", e2);
		Car c2 = new Car(5678, null);

		c2.setModelNo(5687);
		c2.setMachine(m2);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
