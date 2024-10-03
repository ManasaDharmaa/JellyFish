package com.xworkz.penHolder.boot;

public class Pen {
	
	public Pen() {
		System.out.println("public cunstructor");
		
		Pen pen = new Pen(15);
		Pen pen1 = new Pen("XO");
		Pen pen2 = new Pen("Santor", 10);
	}
	
	private Pen(int cost) {
		System.out.println("private constructor");
	}
	
	protected Pen(String brand) {
		System.out.println("protected constructor");
	}
	
	 Pen(String brand, int cost){
		System.out.println("default constructor");
	}
	
	
	
	

}
