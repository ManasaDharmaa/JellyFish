package com.xworkz.papad.runner;

import com.xworkz.papad.boot.Papad;

public class PapadRunner {

	
   public static void main(String[] args) {
		
	Papad papad = new Papad();
	Papad papad1 = new Papad("Coin papad");
	Papad papad2 = new Papad("Coin papad", 235);
	Papad papad3 = new Papad("Coin papad", 235, 'L',100.0d);
	Papad papad4 = new Papad("Coin papad", 235, 'L', 100.0d,90.0f);
	Papad papad5 = new Papad("Coin papad", 235, 'L', 100.0d,90.0f,7865674329l);
	Papad papad6 = new Papad("Coin papad", 235, 'L', 100.0d,90.0f,7865674329l, true);
		
		
		
		
	    papad.apala();
		System.out.println("this is one argument overloding polymorphism " + papad.apala("Coin papad"));
		System.out.println("this is two argument overloding polymorphism " + papad.apala("Coin papad", 235));
		System.out.println("this is three argument overloding polymorphism " + papad.apala("Coin papad",235,'L',100.0d));
		System.out.println("this is four argument overloding polymorphism " + papad.apala("Coin papad", 235, 'L', 100.0d,90.0f));
		System.out.println("this is five argument overloding polymorphism " + papad.apala("Coin papad", 235, 'L', 100.0d,90.0f,7865674329l));
		System.out.println("this is six argument overloding polymorphism " + papad.apala("Coin papad",  235, 'L', 100.0d,90.0f,7865674329l, true));
		
	}
}
