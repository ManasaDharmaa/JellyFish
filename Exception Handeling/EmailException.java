package com.xworkz.rationCard.event;

public class EmailException extends Exception {

	public  EmailException() {

		System.out.println("Your email is not contains 8 letter or it not starts with uppercase or not ends with @gmail.com");
	}
}
