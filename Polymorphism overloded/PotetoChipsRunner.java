package com.xworkz.chips.runner;

import com.xworkz.chips.boot.PotetoChips;

public class PotetoChipsRunner {

	
	public static void main(String[] args) {
		
		PotetoChips potetoChips = new PotetoChips();
		PotetoChips potetoChips1 = new PotetoChips("Lays");
		PotetoChips potetoChips2 = new PotetoChips("Lays", 20);
		PotetoChips potetoChips3 = new PotetoChips("Lays",20,'L',40.0d);
		PotetoChips potetoChips4 = new PotetoChips("Lays", 20, 'L', 40.0d,90.0f);
		PotetoChips potetoChips5 = new PotetoChips("Lays", 20, 'L', 40.0d,90.0f,7865674329l);
		PotetoChips potetoChips6 = new PotetoChips("Lays",  20, 'L', 40.0d,90.0f,7865674329l, true);
		
		
		
		
		potetoChips.chips();
		System.out.println("this is one argument overloding polymorphism " + potetoChips.chips("Lays"));
		System.out.println("this is two argument overloding polymorphism " + potetoChips.chips("Lays", 20));
		System.out.println("this is three argument overloding polymorphism " + potetoChips.chips("Lays",20,'L',40.0d));
		System.out.println("this is four argument overloding polymorphism " + potetoChips.chips("Lays", 20, 'L', 40.0d,90.0f));
		System.out.println("this is five argument overloding polymorphism " + potetoChips.chips("Lays", 20, 'L', 40.0d,90.0f,7865674329l));
		System.out.println("this is six argument overloding polymorphism " + potetoChips.chips("Lays",  20, 'L', 40.0d,90.0f,7865674329l, true));
		
	}
}
