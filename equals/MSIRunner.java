package com.xworkz.laptop.runner;

import com.xworkz.laptop.boot.MSI;

public class MSIRunner {
	
     public static void main(String[] args) {
		
		MSI msi = new MSI("MSI Thin 15", 45990, 1.86f, 16.0d, 512.0f, "windows", 11, 38.1d, "intal core i5", 13);
		
		System.out.println(msi.equals(msi));
	}

}
