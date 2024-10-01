package com.xworkz.laptop.runner;

import com.xworkz.laptop.boot.Acer;

public class AcerRunner {
	
	public static void main(String[] args) {
		
		Acer acer = new Acer("Acer Aspire Lite AMD Ryzen", 42990, 1.6f, 16.0d, 512.0f, "windows", 11, 38.1d, "intal core i5", 13);
		
		System.out.println(acer.equals(acer));
	}


}
