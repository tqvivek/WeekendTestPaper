package com.example;

public class Car {
	private int carid;
	private String brandname;
	private int modelnumber;
	private int price;
	private String fuel;

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public int getModelnumber() {
		return modelnumber;
	}

	public void setModelnumber(int modelnumber) {
		this.modelnumber = modelnumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Car Details carid=" + carid + ", brandname=" + brandname + ", modelnumber=" + modelnumber + ", price="
				+ price + ", fuel=" + fuel + "  ";
	}

}
