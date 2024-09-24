package com.xworkz.puma.boot;

public class Puma {
	
	
	
	public void shows(){
		
		byte cost = 25;
		int price = (int) cost;	
		System.out.println("byte to int casting : "+price);
		
		
		int discount = 150;
		float intDiscount = (float) discount;
		System.out.println("int to float casting : "+intDiscount);
		
		
		double shipingCharges = 90.76f;
		int shipping = (int)  shipingCharges;
		System.out.println("double to int casting : "+shipping);
		
		
		int brandAnimal = 73;
		char intBrandAnml = (char) brandAnimal;
		System.out.println("int to char casting : "+intBrandAnml);
		
		
		boolean isAvailable = false;
		int isAvailableOrNot = false ? 1: 2;
		System.out.println("boolean to int casting : "+isAvailableOrNot);
	}

}
