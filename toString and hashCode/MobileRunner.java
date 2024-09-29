package com.xworkz.mobile.runner;

import com.xworkz.mobile.boot.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile("Redmi", 15000, 10.0f, 'G', 9879086545l, "Lei jun",
				"Motorola", 313, 25000.98f, 8709653423l, "Lenovo",
				8978769806l, 7807, "Munich smart card","Giesecke", 0,
				199.0f, "Pixel 9", "DynaTAC", "Sundar pichai",
				"Martin cooper",36000, 29.0f, 'U',
				5647653267l, "Sundar pichai","pixel",
				657, 134000.0f, 9087564323l, "lee kun hee",
				546700.0f, 9087654321l, "bbk electronics", 78650.0f,
				90876554434l);
		
                System.out.println(mobile.toString());
                System.out.println(mobile.hashCode());
	}
}
