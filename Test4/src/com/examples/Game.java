//. Write a program to implement dynamic method dispatch
//Take a abstract class Game. Create abstract method void rules (). 
//Create non-abstract method and constructors and implement them in inherited class like Basketball, Football etc.

package com.examples;

public abstract class Game {

	abstract void rules();

	public void setUp() {
		System.out.println("Setting up the game...");
	}

	public void start() {
		System.out.println("Starting the game...");
	}

}
