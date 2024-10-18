package com.xworkz.exception.event;

public class MarksException extends Exception{
	
	public void marksAgeException() {
		System.out.println("Your age is to short");
	}

	public void marksPasswordException() {
		System.out.println("Your password is wrong");
	}

	public void marksNameException() {
		System.out.println("Your name is not match");
	}

	public void marksPhoneNumException() {
		System.out.println("Your phone number is not match");
	}

	public void marksEmailException() {
		System.out.println("Your email is wrong");
	}

}
