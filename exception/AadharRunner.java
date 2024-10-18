package com.xworkz.exception.runner;

import com.xworkz.exception.boot.Aadhar;

public class AadharRunner {
	
	public static void main(String[] args)  throws Exception{
		
		Aadhar aadhar = new Aadhar();
		aadhar.aadhar(1, "Amul#1", "Amulya", 9980755381l, "amul@gmail.com");
	}

}
