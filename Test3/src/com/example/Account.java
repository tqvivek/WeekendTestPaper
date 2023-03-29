package com.example;

public class Account {

	private int acid;
	private String name;
	private int balance;
	private String bankname;
	private double pancardno;

	public Account() {

	}

	public Account(int acid, String name, int balance, String bankname, double pancard) {
		super();
		this.acid = acid;
		this.name = name;
		this.balance = balance;
		this.bankname = bankname;
		this.pancardno = pancard;
	}

	public int getAcid() {
		return acid;
	}

	public void setAcid(int acid) {
		this.acid = acid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public double getPancard() {
		return pancardno;
	}

	public void setPancard(double pancard) {
		this.pancardno = pancard;
	}

	@Override
	public String toString() {
		return "Account [acid=" + acid + ", name=" + name + ", balance=" + balance + ", bankname=" + bankname
				+ ", pancardno=" + pancardno + "]";
	}

}
