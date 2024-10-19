package com.xworkz.dl.event;

public class DLException extends Exception{
	
	public void dlAge() {
		System.err.println("Your age is to short");
	}
	public void dlPassword() {
		System.err.println("please give me a valid password");
	}
	public void dlName() {
		System.err.println("please enter a valid name");
	}
	public void dlPhoneNum() {
		System.err.println("your phone no is not starts with 9 ");
	}
	public void dlEmail() {
		System.err.println("incorrect email pleace give me a valid email");
	}

}
