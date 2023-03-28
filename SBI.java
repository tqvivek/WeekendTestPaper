package com.example;

import java.util.Scanner;

public class SBI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();

		System.out.println("Enter Account holder name:");
		a1.setName(sc.next());
		System.out.println("Enter account id:");
		a1.setAcid(sc.nextInt());
		System.out.println("Enter account number:");
		a1.setAcNumber(sc.nextLong());
		System.out.println("Enter the starting balance:");
		a1.setBalance(sc.nextDouble());
		if (a1.getBalance() >= 50000) {
			System.out.println("Enter  Pancard Number:");
			a1.setPanCard(sc.next());
		} else if (a1.getBalance() >= 25000) {
			System.out.println("Enter debit card number:");
			a1.setDebitCard(sc.nextLong());
		}

		System.out.println(a1.toString());

	}

}
