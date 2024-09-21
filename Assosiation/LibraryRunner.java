package com.xworkz.studio.runner;

import com.xworkz.studio.boot.Books;
import com.xworkz.studio.boot.Library;

public class LibraryRunner {
	
	public static void main(String [] args) {
		
		Books books = new Books();
		Library library = new Library();
		
		library.setName("Trust");
		library.setBook(500);
		library.setYearsOfStart(2015.0d);
		library.setOpen(true);
		library.setFirstLetter('B');
		library.setBooks(books);
		library.books.setName("Call Me by Your Name");
		library.books.setCost(354);
		library.books.setYearOfPublish(2009.0d);
		library.books.setPublished(true);
		
	  System.out.println("name of the book: " + library.getName());
	  System.out.println("books : " + library.getBook());
	  System.out.println("published year : " + library.getYearsOfStart());
	  System.out.println("open or close : "+ library.isOpen);
	  System.out.println("first letter of book : "+ library.getFirstLetter());
	  System.out.println("Book name : " + library.books.getName());
	  System.out.println("Book cost : " + library.books.getCost());
	  System.out.println("Book published : " + library.books.getYearOfPublish());
	  System.out.println("Book is publish : " + library.books.isPublished());
	  
	}
	
	
}
