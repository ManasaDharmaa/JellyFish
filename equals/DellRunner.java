package com.xworkz.laptop.runner;

import com.xworkz.laptop.boot.Dell;

public class DellRunner {
	
	public static void main(String[] args) {
		
		
		Dell dell = new Dell("Dell 15 Laptop", 48990, 1.66f, 8.0d, 512.0f, "windows 11",
				11, 15.6d, "intal core i5", 13);
		
		System.out.println(dell.equals(dell));
	}

}
