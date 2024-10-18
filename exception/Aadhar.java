package com.xworkz.exception.boot;

import com.xworkz.exception.event.AadharException;

public class Aadhar {

	public int age;
	public String password;
	public String name;
	public long phoneNum;
	public String email;

	public void aadhar(int age, String password, String name, long phoneNum, String email) throws Exception{
		if (age > 0) {
			System.out.println("Your eligibal to getting adhar card");
			
		} else {
			throw new AadharException();
		}
        if ((password.length() < 8 && password.matches(".*[@#*&$].*") && password.matches(".*[a-z].*")
				&& password.matches(".*[A-Z].*") && password.matches(".*[0-9].*"))) {
			System.out.println("password has been successfull");
			
		} else {
			throw new AadharException();
		}
        if (name.length() > 5 && Character.isUpperCase(name.charAt(0))) {
			System.out.println("your name is valid");
			
		} else {
			throw new AadharException();
		} 
        if (phoneNum > 11) {
			System.out.println("your number is valid");

		} else {
			throw new AadharException();
		}
        if ((email.length() <= 15) && email.contains("@gmail.com")) {
			System.out.println("your Email is valid");
			
		} else {
			throw new AadharException();
		}

	}
}
