package com.xworkz.laptop.runner;

import com.xworkz.laptop.boot.Lenovo;

public class LenovoRunner {
	
	
	public static void main(String[] args) {
		
		Lenovo lenovo = new Lenovo("Lenovo ideaPad slim 3", 59990, 1.6f, 16.0d, 512.0f, "windows", 11, 38.1d, "intal core i5", 13);
		
		System.out.println(lenovo.equals(lenovo));
	}

}
