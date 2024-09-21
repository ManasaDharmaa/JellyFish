package com.xworkz.apple.runner;

import com.xworkz.apple.boot.IPad;
import com.xworkz.apple.boot.MacBook;

public class IPhoneRunner {
	
	
	public static void main(String [] args) {
		
		MacBook macBook = new MacBook();
		IPad iPad = new IPad();
		
		iPad.setLogo("Apple");
		iPad.setVersion(16);
		iPad.setCost(140000.0d);
		iPad.setCharged(true);
		iPad.setMacBook(macBook);
		
		iPad.macBook.setLogo("Apple");
		iPad.macBook.setVersion(12);
		iPad.macBook.setCost(82000.0d);
		iPad.macBook.setCharged(true);
		
		System.out.println("logo : " + iPad.getLogo());
		System.out.println("Version : " + iPad.getVersion());
		System.out.println("Cost : " + iPad.getCost());
		System.out.println("Charged : " + iPad.isCharged());
		
		System.out.println("logo : " + iPad.getMacBook().getLogo());
		System.out.println("Version : " + iPad.getMacBook().getVersion());
		System.out.println("Cost : " + iPad.getMacBook().getCost());
		System.out.println("Charged : " + iPad.getMacBook().isCharged());
	}

}
