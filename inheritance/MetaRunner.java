package com.xworkz.company.runner;

import com.xworkz.company.boot.WhatsApp;

public class MetaRunner {
	
	public static void main(String [] args) {
		
		
		WhatsApp whatsApp = new WhatsApp();
		
		whatsApp.setProduct("Instagram");
		whatsApp.setSocialMediaPlatforms(4);
		whatsApp.setMessagingApps(3.0f);
		whatsApp.setVrAndAr(3.0d);
		whatsApp.setFamousPlatform('F');
		whatsApp.setTreanding(true);
		whatsApp.setWhatsApp(whatsApp);
		
		
		System.out.println("product : " + whatsApp.getProduct());
		System.out.println("Social media platform : " + whatsApp.getSocialMediaPlatforms());
		System.out.println("Messaging apps : " + whatsApp.getMessagingApps());
		System.out.println("virtual reality and augmented reality : " + whatsApp.getVrAndAr());
		System.out.println("famous platform : " + whatsApp.getFamousPlatform());
		System.out.println("meta is trending or not : " + whatsApp.isTreanding());
		
	}

}
