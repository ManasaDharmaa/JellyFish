package com.xworkz.laptop.runner;

import com.xworkz.laptop.boot.MiLaptop;

public class MiLaptopRunner {
	
	public static void main(String[] args) {
		
		MiLaptop miLaptop = new MiLaptop("Xiomi NoteBook Ultra XMA2007", 43859, 1.7f, 16.0d, 512.0f,
				"Windows 10", 10, 15.6d, "i5", 11);
		
		System.out.println(miLaptop.equals(miLaptop));
		
	}

}
