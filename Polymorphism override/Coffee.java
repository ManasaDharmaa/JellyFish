package com.xworkz.coffee.boot;

public class Coffee extends Milk{
	
	@Override
	public void brand() {
		System.out.println("this is  child class  brand method");
		
	}
	@Override
	public void cost() {
		System.out.println("this is  child class  cost method");
		
	}
	@Override
	public void fat() {
		System.out.println("this is  child class  fat method");
		
	}
	@Override
	public void litter() {
		System.out.println("this is  child class  litter method");
		
	}
	@Override
	public void vitamin() {
		System.out.println("this is  child class  vitamin method");
		
	}

}
