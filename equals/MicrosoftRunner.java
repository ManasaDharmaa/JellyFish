package com.xworkz.laptop.runner;

import com.xworkz.laptop.boot.Microsoft;

public class MicrosoftRunner {
	
    public static void main(String[] args) {
		
    	Microsoft microsoft = new Microsoft("Microsoft surface Laptop", 69990, 1.6f, 8.0d, 256.0f, "windows", 11, 38.1d, "intal core i5", 12);
		
		System.out.println(microsoft.equals(microsoft));
	}

}
