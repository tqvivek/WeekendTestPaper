//Q5. Write a program to create a Book class having id, name, price. Create containment of author (id, name, address).
//Create constructor and getter and setters. Create anonymous author object in book.
package com.examples;

public class Book {
	private int bookid;
	private String bookname;
	private float bookprice;

	public Book() {

	}

	public Book(int bid, String bname, float bprice) {
		this.bookid = bid;
		this.bookname = bname;
		this.bookprice = bprice;
	}

	public void setBookid(int bid) {
		this.bookid = bid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookname(String bname) {
		this.bookname = bname;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookprice(float bprice) {
		this.bookprice = bprice;
	}

	public float getBookprice() {
		return bookprice;
	}

	public String toString() {
		return "Book Info:" + "BookId:" + bookid + "BookPrice:" + bookprice;
	}

}
