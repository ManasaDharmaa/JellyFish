package com.xworkz.dl.boot;

import com.xworkz.dl.event.MarksException;

public class Marks {
	
	public int age;
	public String password;
	public String name;
	public long phoneNum;
	public String email;

	public Marks(int age, String password, String name, long phoneNum, String email) throws Exception {
		if (age > 18) {
			System.out.println("Your eligibal to getting Pan card");
		} else {
			MarksException marksException= new MarksException();
			marksException.marksAge();

		}

		if ((password.length() < 8 && password.matches(".*[@#*&$].*") && password.matches(".*[a-z].*")
				&& password.matches(".*[A-Z].*") && password.matches(".*[0-9].*"))) {
			System.out.println("password has been successfull");
		} else {
			MarksException marksException= new MarksException();
			marksException.marksPassword();
		}

		if (name.length() > 5 && Character.isUpperCase(name.charAt(0))) {
			System.out.println("your name is valid");
		} else {
			MarksException marksException= new MarksException();
			marksException.marksName();
		}

		if ((phoneNum > 999999999l && phoneNum < 10000000000l) && (String.valueOf(phoneNum).startsWith("9"))) {
			System.out.println("your number is valid");

		} else {
			MarksException marksException= new MarksException();
			marksException.marksPhoneNum();
		}
		if ((email.length() <= 15) && email.contains("@gmail.com")) {
			System.out.println("your Email is valid");
		} else {
			MarksException marksException= new MarksException();
			marksException.marksEmail();
		}
	}

}
