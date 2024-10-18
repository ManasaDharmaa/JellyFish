package com.xworkz.exception.boot;

import com.xworkz.exception.event.PanException;

public class Pan {

	public int age;
	public String password;
	public String name;
	public int phoneNum;
	public String email;

	public void panAge(int age) {
		if (age > 18) {
			System.out.println("Your eligibal to getting Pan card");
		} else {
			throw new PanException();

		}
	}

	public void panPassword(String password) {
		if ((password.length() < 8 && password.matches(".*[@#*&$].*") && password.matches(".*[a-z].*")
				&& password.matches(".*[A-Z].*") && password.matches(".*[0-9].*"))) {
			System.out.println("password has been successfull");
	}else{
		throw new PanException();
	}

	}

	public void panName(String name) {
		
		 if(name.length() > 5 && Character.isUpperCase(name.charAt(0)))  {
			System.out.println("your name is valid");
		} else {
			throw new PanException();
		}
	}

	public void panPhoneNum(int phoneNum) {
		if (phoneNum > 10) {
			System.out.println("your number is valid");

		} else {
			throw new PanException();
		}
	}

	public void panEmail(String email) {
		if ((email.length() <= 15) && email.contains("@gmail.com")) {
			System.out.println("your Email is valid");
		} else {
			throw new PanException();
		}
	}

}
