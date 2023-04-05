package com.demo;

public class Engine {
	private String engineType;
	private int price;

	public Engine(String engineType, int price) {
		super();
		this.engineType = engineType;
		this.price = price;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
