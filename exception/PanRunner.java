package com.xworkz.exception.runner;

import com.xworkz.exception.boot.Pan;

public class PanRunner {
	
	public static void main(String[] args) throws RuntimeException {
		
		Pan pan = new Pan();
	
		
		pan.panAge(22);
		pan.panPassword("vAid@14");
		pan.panName("Manasa");
		pan.panPhoneNum(9123456789l);
		pan.panEmail("Manas@gmail.com");
	}

}
