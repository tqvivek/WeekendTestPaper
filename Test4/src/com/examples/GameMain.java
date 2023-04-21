package com.examples;

public class GameMain {

	public static void main(String[] args) {

		// Game g1 = new BasketBall();
		// Game g2 = new FootBall();

		Game g1;
		g1 = new BasketBall();
		g1.setUp();
		g1.rules();
		g1.start();

		System.out.println("-------------------------");

		g1 = new FootBall();
		g1.setUp();
		g1.rules();
		g1.start();

	}

}
