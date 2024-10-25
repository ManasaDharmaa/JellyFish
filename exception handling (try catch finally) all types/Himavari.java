package com.xworkz.doll.boot;

import com.xworkz.doll.event.AgeException;

public class Himavari {

	public int age;

	public Himavari(int age)  {

		try {
			if (age > 18) {
				System.out.println("age is correct");
			} else if (age < 0) {
				throw new AgeException();

			} else {
				throw new IllegalAccessException();
			}
		} catch (IllegalAccessException | AgeException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Your age is less than 18");
		}

	}

}
