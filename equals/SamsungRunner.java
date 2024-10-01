package com.xworkz.laptop.runner;

import com.xworkz.laptop.boot.Samsung;

public class SamsungRunner {
	
    public static void main(String[] args) {
		
    	Samsung samsung = new Samsung("samsung Galaxy book4", 67990, 1.88f, 8.0d, 512.0f, "windows", 11, 39.62d, "intal core 5", 13);
		
		System.out.println(samsung.equals(samsung));
	}


}
