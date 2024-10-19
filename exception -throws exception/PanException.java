package com.xworkz.dl.event;

public class PanException extends Exception{
	
	
	public void panAge() {
		System.err.println("Your age is to short");
	}
	public void panPassword() {
		System.err.println("please give me a valid password");
	}
	public void panName() {
		System.err.println("please enter a valid name");
	}
	public void panPhoneNum() {
		System.err.println("your phone no is not starts with 9 ");
	}
	public void panEmail() {
		System.err.println("incorrect email pleace give me a valid email");
	}

}
