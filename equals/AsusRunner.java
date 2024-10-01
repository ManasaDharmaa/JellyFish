package com.xworkz.laptop.runner;

import com.xworkz.laptop.boot.Asus;

public class AsusRunner {
	
	public static void main(String[] args) {
		
		Asus asus = new Asus("Asus vivobook", 55990, 1.88f, 8.0d, 512.0f, "windows", 11, 40.64d, "intal iris X", 13);
		
		System.out.println(asus.equals(asus));
	}

}
