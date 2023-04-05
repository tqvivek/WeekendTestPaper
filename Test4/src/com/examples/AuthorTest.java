package com.examples;

public class AuthorTest {

	public static void main(String[] args) {

		Book b1 = new Book(1, "Agnipankh", 500f);

		Author a1 = new Author(101, "Dr.APJ Abdul Kalam", "Tamilnadu", b1);
		System.out.println(a1);

	}

}
