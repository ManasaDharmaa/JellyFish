package com.xworkz.exception.event;

public class DLException extends Exception{

	public void dlAgeException() {
		System.out.println("Your age is to short");
	}

	public void dlPasswordException() {
		System.out.println("Your password is wrong");
	}

	public void dlNameException() {
		System.out.println("Your name is not match");
	}

	public void dlPhoneNumException() {
		System.out.println("Your phone number is not match");
	}

	public void dlEmailException() {
		System.out.println("Your email is wrong");
	}
}
