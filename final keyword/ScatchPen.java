package com.xworkz.penHolder.boot;

public class ScatchPen {
	
	
	public final String brand = "OX";
	public final int cost = 15;
	public final double setOfPen = 10.0d;
	public final char color = 'M';
	public final boolean isMulticolors = true;
	
	
	public final static void display() {
		
		System.out.println("is this final method");
		
		ScatchPen scatchPen = new ScatchPen();
		System.out.println(scatchPen.brand);
		System.out.println(scatchPen.cost);
		System.out.println(scatchPen.setOfPen);
		System.out.println(scatchPen.color);
		System.out.println(scatchPen.isMulticolors);
	}
	

}
