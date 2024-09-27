package com.xworkz.juice.boot;

public class VegetableJuice  extends FruitJuice{
	
	@Override
	public void brand() {
		System.out.println("this is  child class  brand method");
		
	}
	@Override
	public void cost() {
		System.out.println("this is  child class  cost method");
		
	}
	@Override
	public void fruits() {
		System.out.println("this is  child class  fruits method");
		
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
