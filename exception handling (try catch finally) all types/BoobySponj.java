package com.xworkz.doll.boot;

import com.xworkz.doll.event.AgeException;

public class BoobySponj {

	public int age;

	public BoobySponj(int age) {

		try {
			if (age > 18) {
				System.out.println("age is correct");
			} else if (age < 0) {

				throw new Exception();
			} else {
				throw new AgeException();
			}
		} catch (AgeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
