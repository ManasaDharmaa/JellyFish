package com.xworkz.rationCard.event;

public class AgeException extends Exception {

	public  AgeException(){

		System.err.println("Your age is less than 18");
	}
}
