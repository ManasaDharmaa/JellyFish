package com.xworkz.dl.boot;

import com.xworkz.dl.event.AadharException;


public class Aadhar {
	
	public int age;
	public String password;
	public String name;
	public long phoneNum;
	public String email;

	public Aadhar(int age, String password, String name, long phoneNum, String email) throws Exception {
		if (age > 18) {
			System.out.println("Your eligibal to getting Pan card");
		} else {
			AadharException aadharException= new AadharException();
			aadharException.aadharAge();

		}

		if ((password.length() < 8 && password.matches(".*[@#*&$].*") && password.matches(".*[a-z].*")
				&& password.matches(".*[A-Z].*") && password.matches(".*[0-9].*"))) {
			System.out.println("password has been successfull");
		} else {
			AadharException aadharException= new AadharException();
			aadharException.aadharPassword();
		}

		if (name.length() > 5 && Character.isUpperCase(name.charAt(0))) {
			System.out.println("your name is valid");
		} else {
			AadharException aadharException= new AadharException();
			aadharException.aadharName();
		}

		if ((phoneNum > 999999999l && phoneNum < 10000000000l) && (String.valueOf(phoneNum).startsWith("9"))) {
			System.out.println("your number is valid");

		} else {
			AadharException aadharException= new AadharException();
			aadharException.aadharPhoneNum();
		}
		if ((email.length() <= 15) && email.contains("@gmail.com")) {
			System.out.println("your Email is valid");
		} else {
			AadharException aadharException= new AadharException();
			aadharException.aadharEmail();
		}
	}

}
