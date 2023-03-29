/* Q.6)Create a class Account(id, accno, name, pancard, debitCard, balance). Create constructors, getter setter and toString . 
Pan Card is added if balance is greater than 50000
Debit Card is given if balance is greater than 25000
Create 2 Banks SBIBank and HDFCBank . Create 2 objects in both class. Take input and display them 
*************/
package com.example;

public class Account {
	private int acid;
	private long acNumber;
	private String name;
	private String panCard;
	private long debitCard;
	private double balance;

	public Account() {

	}

	public Account(int acid, long acNumber, String name, String panCard, long debitCard, double balance) {
		this.acid = acid;
		this.acNumber = acNumber;
		this.name = name;
		this.panCard = panCard;
		this.debitCard = debitCard;
		this.balance = balance;
	}

	public int getAcid() {
		return acid;
	}

	public void setAcid(int acid) {
		this.acid = acid;
	}

	public long getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(long acNumber) {
		this.acNumber = acNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public long getDebitCard() {
		return debitCard;
	}

	public void setDebitCard(long debitCard) {
		this.debitCard = debitCard;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [acid=" + acid + ", acNumber=" + acNumber + ", name=" + name + ", panCard=" + panCard
				+ ", debitCard=" + debitCard + ", balance=" + balance + "]";

	}
}
