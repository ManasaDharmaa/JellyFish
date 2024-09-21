package com.xworkz.studio.boot;

public class Library {
	
	public String name;
	public int book;
	public double yearsOfStart;
	public boolean isOpen;
	public char firstLetter;
	public Books books;
	
	

	public String getName() {
		return name;
	}

	public int getBook() {
		return book;
	}

	public double getYearsOfStart() {
		return yearsOfStart;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public char getFirstLetter() {
		return firstLetter;
	}

	public Books getBooks() {
		return books;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBook(int book) {
		this.book = book;
	}

	public void setYearsOfStart(double yearsOfStart) {
		this.yearsOfStart = yearsOfStart;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public void setFirstLetter(char firstLetter) {
		this.firstLetter = firstLetter;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
	
	
	
	
	

}
