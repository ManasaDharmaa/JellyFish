package com.xworkz.king.boot;

public class Yuvaraja extends Raja{
	
	
public void display() {
		
		//Protected
		super.isHaveDoughter = true;
		super.samrajya = 'V';
		
		
		// Default
		super.noOfWife = 3.0f;
		super.noOfCapital = 1.0d;
		
		//public 
		
		super.MahaRaniName = "Surekha";
		super.noOfGrandChild = 10;
		
		
		
		
		System.out.println(isHaveDoughter);
		System.out.println(samrajya);
		System.out.println(noOfWife);
		System.out.println(noOfCapital);
		System.out.println(MahaRaniName);
		System.out.println(noOfGrandChild);
		
		
	}

}
