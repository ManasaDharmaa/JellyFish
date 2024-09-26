package com.xworks.makhana.runner;

import com.xworks.makhana.boot.Makhana;

public class MakhanaRunner {
	
	public static void main(String[] args) {
		
		Makhana makhana = new Makhana();
		Makhana makhana1 = new Makhana("Mr Makhana");
		Makhana makhana2 = new Makhana("Mr Makhana", 50);
		Makhana makhana3 = new Makhana("Mr Makhana", 50, 'L',25.0d);
		Makhana makhana4 = new Makhana("Mr Makhana", 50, 'L', 25.0d,90.0f);
		Makhana makhana5 = new Makhana("Mr Makhana", 50, 'L', 25.0d,90.0f,7865674329l);
		Makhana makhana6 = new Makhana("Mr Makhana", 50, 'L', 25.0d,90.0f,7865674329l, true);
			
			
			
			
		makhana.lotusSeed();
			System.out.println("this is one argument overloding polymorphism " + makhana.lotusSeed(" Mr Makhana"));
			System.out.println("this is two argument overloding polymorphism " + makhana.lotusSeed(" Mr Makhana", 50));
			System.out.println("this is three argument overloding polymorphism " + makhana.lotusSeed(" Mr Makhana",50,'L',25.0d));
			System.out.println("this is four argument overloding polymorphism " + makhana.lotusSeed(" Mr Makhana", 50, 'L', 25.0d,90.0f));
			System.out.println("this is five argument overloding polymorphism " + makhana.lotusSeed(" Mr Makhana", 50, 'L', 25.0d,90.0f,7865674329l));
			System.out.println("this is six argument overloding polymorphism " + makhana.lotusSeed(" Mr Makhana",  50, 'L', 25.0d,90.0f,7865674329l, true));
			
		}

}
