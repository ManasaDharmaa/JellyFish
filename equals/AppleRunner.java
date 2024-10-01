package com.xworkz.laptop.runner;

import com.xworkz.laptop.boot.Apple;

public class AppleRunner {
	
     public static void main(String[] args) {
		
    	 Apple apple = new Apple("Apple Mac Book Air Laptop", 58990, 1.6f, 8.0d, 256.0f, "macOS", 11, 13.3d, "Apple M1 chip", 13);
		
		System.out.println(apple.equals(apple));
	}

}
