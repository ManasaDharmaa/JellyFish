package com.xworkz.doll.boot;

import com.xworkz.doll.event.EmailException;


public class Sinchan {
	
	public String email;

	public Sinchan(String email) {

		if ((email.length() <= 15) && email.contains("@gmail.com")) {
			System.out.println("your Email is valid");

		} else {
			try {
				throw new EmailException();
			} catch (EmailException e) {
				e.printStackTrace();
			} finally {
				System.out.println(
						"Your email is not contains 8 letter or it not starts with uppercase or not ends with @gmail.com");
			}
		}
	}
	

}
