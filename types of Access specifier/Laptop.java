package com.xworkz.mi.runner;

import com.xworkz.mi.boot.Phone;

public class Laptop extends Phone{
	
	
public void display() {
		
		//Protected
		super.isHaveHeadPhonePin = true;
		super.symbol = 'M';		
		
		//public 	
		super.anotherName = "xiaomi";
		super.series = 10;
				
		System.out.println(isHaveHeadPhonePin);
		System.out.println(symbol);
		
		System.out.println(anotherName);
		System.out.println(series);
		
		
	}


}
