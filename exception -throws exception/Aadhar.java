package com.xworkz.dl.boot;

import com.xworkz.dl.event.AgeException;
import com.xworkz.dl.event.BatchException;
import com.xworkz.dl.event.EmailException;
import com.xworkz.dl.event.NameException;
import com.xworkz.dl.event.PasswordException;
import com.xworkz.dl.event.PhoneNumException;

public class Aadhar {

	public int age;
	public String password;
	public String name;
	public long phoneNum;
	public String email;
	public boolean batch;
	public int letterCount = 0;
	public int digitCount = 0;
	public int upperCount = 0;
	public int specialCount = 0;
	String specialCharacters = "@#$&";

	public void Aadhar(int age, String password, String name, long phoneNum, String email, boolean batch)
			throws Exception {
		if (age > 18) {
			System.out.println("your age is correct");
		} else {
			throw new AgeException();
		}

		for (char ch : password.toCharArray()) {
			if (Character.isLetter(ch)) {
				letterCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			}
			if (Character.isUpperCase(ch)) {
				upperCount++;
			} else if (specialCharacters.contains(String.valueOf(ch))) {
				specialCount++;
			}

		}
		if (letterCount == 5 && digitCount == 2 && upperCount == 1 && specialCount == 1) {
			System.out.println("password is valid");
		} else {
			throw new PasswordException();
		}

		if (name.length() < 8 && Character.isUpperCase(name.charAt(0))) {
			System.out.println("your name is valid");
		} else {
			throw new NameException();
		}

		if ((phoneNum > 999999999l && phoneNum < 10000000000l) && (String.valueOf(phoneNum).startsWith("9"))) {
			System.out.println("your number is valid");

		} else {
			throw new PhoneNumException();
		}
		if ((email.length() == 15) && email.contains("@gmail.com") && Character.isUpperCase(name.charAt(0))
				&& name.substring(1).equals(name.substring(1).toLowerCase())) {
			System.out.println("your Email is valid");
		} else {
			throw new EmailException();
		}
		if (batch == true) {
			System.out.println("batch will be true");
		} else {
			throw new BatchException();
		}
	}

}
