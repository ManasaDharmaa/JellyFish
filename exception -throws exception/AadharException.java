package com.xworkz.dl.event;

public class AadharException extends Exception{
	
	public void aadharAge() {
		System.err.println("Your age is to short");
	}
	public void aadharPassword() {
		System.err.println("please give me a valid password");
	}
	public void aadharName() {
		System.err.println("please enter a valid name");
	}
	public void aadharPhoneNum() {
		System.err.println("your phone no is not starts with 9 ");
	}
	public void aadharEmail() {
		System.err.println("incorrect email pleace give me a valid email");
	}

}
