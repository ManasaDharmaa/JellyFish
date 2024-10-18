package com.xworkz.exception.event;

public class PanException extends RuntimeException{

	public void panAgeException() {
		System.out.println("Your age is to short");
	}
	public void panPasswordException() {
		System.out.println("Your password is wrong");
	}
	public void panNameException() {
		System.out.println("Your name is not match");
	}
	public void panPhoneNumException() {
		System.out.println("Your phone number is not match");
	}
	public void panEmailException() {
		System.out.println("Your email is wrong");
	}
	
	

}
