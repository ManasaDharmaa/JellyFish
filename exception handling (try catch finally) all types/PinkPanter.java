package com.xworkz.doll.boot;

import com.xworkz.doll.event.AgeException;

public class PinkPanter {
	
	public int age;

	public PinkPanter(int age) throws AgeException{

		try {
			if (age > 18) {
				System.out.println("your age is correct");
			} else {

				throw new AgeException();
			}
		} finally {
			System.out.println("Your age is less than 18");
		}

	}


}
