package com.xworkz.mi.boot;

public class Phone {
	
	   //private access that class only
		private String fullName;
		private int version;
		
		
		// protected access the same package but we extend the child class another package it can be access 
		protected boolean isHaveHeadPhonePin;
		protected char symbol;
		
		//default is only access same package with or without extends the class 
		 float cost;
		 double discount;
		
		//public can access any other class or package
		public String anotherName;
		public int series;

}
