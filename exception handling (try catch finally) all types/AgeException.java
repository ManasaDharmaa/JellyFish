package com.xworkz.doll.event;

public class AgeException extends Exception {

	public AgeException() {

		System.err.println("Your age is less than 18");
	}

}
