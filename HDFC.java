package com.example;

import java.util.Scanner;

public class HDFC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a2 = new Account();

		System.out.println("Enter Account holder name:");
		a2.setName(sc.next());
		System.out.println("Enter account id:");
		a2.setAcid(sc.nextInt());
		System.out.println("Enter account number:");
		a2.setAcNumber(sc.nextLong());
		System.out.println("Enter the starting balance:");
		a2.setBalance(sc.nextDouble());
		if (a2.getBalance() >= 50000) {
			System.out.println("Enter  Pancard Number:");
			a2.setPanCard(sc.next());
		} else if (a2.getBalance() >= 25000) {
			System.out.println("Enter debit card number:");
			a2.setDebitCard(sc.nextLong());
		}

		System.out.println(a2.toString());

	}

}
