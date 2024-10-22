package com.xworkz.rationCard.boot;

import com.xworkz.rationCard.event.AgeException;
import com.xworkz.rationCard.event.BatchException;
import com.xworkz.rationCard.event.EmailException;
import com.xworkz.rationCard.event.NameException;
import com.xworkz.rationCard.event.PasswordException;
import com.xworkz.rationCard.event.PhoneNumException;

public class RationCard {

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

	public RationCard(int age, String password, String name, long phoneNum, String email, boolean batch)  {
		if (age > 18) {
			System.out.println("your age is correct");
		} else {
			try {
				throw new AgeException();
			}catch(AgeException e) {
				e.printStackTrace();
			}finally {
				System.out.println("Your age is less than 18");
			}
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
			try {
		    throw new PasswordException();
			}catch(PasswordException e) {
				e.printStackTrace();
			}finally{
				System.out.println("your password not contains 7 letter or not 2 numbers or 1 charrecter or 1 uppercase");
				
			}
		}


		if (name.length() < 8 && Character.isUpperCase(name.charAt(0))) {
			System.out.println("your name is valid");
		} else {
			try {
			throw new NameException();
			} catch(NameException e ) {
				e.printStackTrace();
			} finally {
				System.out.println("Your name not contains 8 letters or it containt numbers or charecters or first letter not should be a upper case");
			}
		}

		if ((phoneNum > 999999999l && phoneNum < 10000000000l) && (String.valueOf(phoneNum).startsWith("9"))) {
			System.out.println("your number is valid");

		} else {
			try {
			throw new PhoneNumException();
			}catch (PhoneNumException e) {
				e.printStackTrace();
			}finally {
				System.out.println("Your number is not contains 10 or not starts with 9 ");
			}
		}
		if ((email.length() == 15) && email.contains("@gmail.com") && Character.isUpperCase(name.charAt(0)) && name.substring(1).equals(name.substring(1).toLowerCase())) {
			System.out.println("your Email is valid");
		} else {
			try {
			throw new EmailException();
			}catch(EmailException e) {
				e.printStackTrace();
			}finally {
				System.out.println("Your email is not contains 8 letter or it not starts with uppercase or not ends with @gmail.com");
			}
		}
		if(batch == true) {
			System.out.println("batch will be true");
		} else {
			try {
			throw new BatchException();
			}catch(BatchException e) {
				e.printStackTrace();
			}finally {
				System.out.println("Your batch is false");
			}
		}
	}

}
