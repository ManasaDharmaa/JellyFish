package com.xworkz.dl.event;

public class MarksException extends Exception{
	
	public void marksAge() {
		System.err.println("Your age is to short");
	}
	public void marksPassword() {
		System.err.println("please give me a valid password");
	}
	public void marksName() {
		System.err.println("please enter a valid name");
	}
	public void marksPhoneNum() {
		System.err.println("your phone no is not starts with 9 ");
	}
	public void marksEmail() {
		System.err.println("incorrect email pleace give me a valid email");
	}

}
