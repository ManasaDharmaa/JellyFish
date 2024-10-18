package com.xworkz.exception.boot;

import com.xworkz.exception.event.PanException;

public class DL {

	public int age;
	public String password;
	public String name;
	public long phoneNum;
	public String email;

	public void dlAge(int age) {
		if (age > 18) {
			System.out.println("Your eligibal to getting dl ");
		} else {
			throw new PanException();

		}
	}

	public void dlPassword(String password) {
		if ((password.length() < 8 && password.matches(".*[@#*&$].*") && password.matches(".*[a-z].*")
				&& password.matches(".*[A-Z].*") && password.matches(".*[0-9].*"))) {
			System.out.println("password has been successfull");
		} else {
			throw new PanException();
		}

	}

	public void dlName(String name) {

		if (name.length() > 5 && Character.isUpperCase(name.charAt(0))) {
			System.out.println("your name is valid");
		} else {
			throw new PanException();
		}
	}

	public void dlPhoneNum(long phoneNum) {
		if (phoneNum > 10) {
			System.out.println("your number is valid");

		} else {
			throw new PanException();
		}
	}

	public void dlEmail(String email) {
		if ((email.length() <= 15) && email.contains("@gmail.com")) {
			System.out.println("your Email is valid");
		} else {
			throw new PanException();
		}
	}

}
