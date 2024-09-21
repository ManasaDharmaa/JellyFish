package com.xworkz.meta.runner;

import com.xworkz.meta.boot.WhatsApp;

public class MetaRunner {
	
	public static void main(String[] args) {
		
		WhatsApp whatsApp = new WhatsApp(); 
		
		whatsApp.setCeo("mark zuckerberg");
		whatsApp.setTotalSocialMediaPlatforms(4);
		whatsApp.seteCommerce(4.0f);
		whatsApp.setMessengingApps(4.0d);
		whatsApp.setSymbole('I');
		whatsApp.setCeoName("will cathcart");
		whatsApp.setSocialMediaPlatforms(5);
		whatsApp.seteCommercePlatform(6.0f);
		whatsApp.setMessenging(7.0d);
		whatsApp.setSyml('W');
		
		
		System.out.println("ceo of whatsapp"+whatsApp.getCeo());
		System.out.println("Total Social Media Platforms whatsapp"+whatsApp.getTotalSocialMediaPlatforms());
		System.out.println("e Commerce whatsapp"+whatsApp.geteCommerce());
		System.out.println("Messenging Apps  of whatsapp"+whatsApp.getMessengingApps());
		System.out.println("Symbole of whatsapp"+whatsApp.getSymbole());
		System.out.println("ceo of Meta"+whatsApp.getCeoName());
		System.out.println("Social Media Platform of Meta"+whatsApp.getSocialMediaPlatforms());
		System.out.println("e Commerce Platform Meta"+whatsApp.geteCommercePlatform());
		System.out.println("Messengers of Meta"+whatsApp.getMessenging());
		System.out.println("Symbole of Meta"+whatsApp.getSyml());
	}

}
