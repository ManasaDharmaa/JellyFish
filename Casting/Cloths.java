package com.xworkz.puma.boot;

public class Cloths extends Puma{
	
	
	public void casting() {
		
		
		
		
		int cost = 250;
		byte price = (byte) cost;	
		System.out.println("int to byte casting : "+price);
		
		
		float discount = 150.0f;
		int intDiscount = (int) discount;
		System.out.println("float to int casting : "+intDiscount);
		
		
		int shipingCharges = 90;
		double shipping = (double)  shipingCharges;
		System.out.println("int to double casting : "+shipping);
		
		
		char brandAnimal = 'C';
		int intBrandAnml = (int) brandAnimal;
		System.out.println("char to int casting : "+intBrandAnml);
		
		
		boolean isAvailable = false;
		int isAvailableOrNot = true ? 1: 2;
		System.out.println("boolean to int casting : "+isAvailableOrNot);
	}

}
