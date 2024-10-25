package com.xworkz.doll.boot;

import com.xworkz.doll.event.AgeException;

public class Doreman {

	public int age;

	public Doreman(int age) {
		
		if(age > 18) {
			System.out.println("your age is correct");
		} else {
			try {
			throw new AgeException();
			}catch(AgeException e) {
				e.printStackTrace();
			}
		}
	}

}
