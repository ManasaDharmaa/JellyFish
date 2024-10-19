package com.xworkz.exception.runner;

import com.xworkz.exception.boot.DL;

public class DLRunner {
	
	public static void main(String[] args) {
		
		DL dl = new DL();
		dl.dlAge(44);
		dl.dlPassword("Hasg$12");
		dl.dlName("Harshi");
		dl.dlEmail("harsh@gmail.com");
		dl.dlPhoneNum(9980765420l);
	}

}
