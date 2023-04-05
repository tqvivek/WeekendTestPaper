package com.examples;

public class Author {
	private int authorId;
	private String name;
	private String address;
	private Book book;

	public Author() {

	}

	public Author(int authorId, String name) {
		this.authorId = authorId;
		this.name = name;

	}

	public Author(int authorId, String name, String address, Book book) {
		this(authorId, name);
		this.address = address;
		this.book = book;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String toString() {
		return "\tAuthor Info:" + "\tAuthor Id:" + authorId + "\tAuthor name:" + name + "Address:" + address + book;

	}

}
