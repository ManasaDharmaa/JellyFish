package com.xworkz.onlineShoppingApps.runner;

import com.xworkz.onlineShoppingApps.boot.Flipcart;
import com.xworkz.onlineShoppingApps.boot.OnlineShoppingApps;

public class OnlineShoppingAppRunner {

	public static void main(String[] args) {

		OnlineShoppingApps onlineShoppingApps = new Flipcart();
		
		System.out.println(onlineShoppingApps.appName());
		System.out.println(onlineShoppingApps.isOnlineDeliveryAvailable());
		System.out.println(onlineShoppingApps.dailyUpdates());
		System.out.println(onlineShoppingApps.payment());
		System.out.println(onlineShoppingApps.listOfThinks());
		System.out.println(onlineShoppingApps.cart());
		System.out.println(onlineShoppingApps.itemsList());
		System.out.println(onlineShoppingApps.categories());
		System.out.println(onlineShoppingApps.addToFev());
		System.out.println(onlineShoppingApps.buyItOption());
		System.out.println(onlineShoppingApps.applicationName());
		System.out.println(onlineShoppingApps.categorie());
		System.out.println(onlineShoppingApps.fevList());
		System.out.println(onlineShoppingApps.products());
		System.out.println(onlineShoppingApps.cosmatics());
		System.out.println(onlineShoppingApps.grosaries());
		System.out.println(onlineShoppingApps.cloths());
		System.out.println(onlineShoppingApps.cstmrCare());
		System.out.println(onlineShoppingApps.toys());
		System.out.println(onlineShoppingApps.typesOfMobiles());
		
		
	}

}
