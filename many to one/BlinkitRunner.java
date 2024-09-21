package com.xworkz.food.runner;

import com.xworkz.food.boot.Blinkit;
import com.xworkz.food.boot.Swiggy;
import com.xworkz.food.boot.Zomato;

public class BlinkitRunner {
	
	
	public static void main(String [] args) {
		
		Swiggy swiggy = new Swiggy("food delivery", 2014, 6.000d, 11.247f, 'S',true);
		Zomato zomato = new Zomato("online food delivery", 2008, 7.000d, 2.301f, 'S', true);
		Blinkit blinkit = new Blinkit("online grocery delivery", 2013, 78.098d, 12.980f, 'S', true, zomato, swiggy);
		
		
		System.out.println("blinkit");
		System.out.println(blinkit.getServices());
		System.out.println(blinkit.getFounded());
		System.out.println(blinkit.getEmployees());
		System.out.println(blinkit.getRevenue());
		System.out.println(blinkit.getExpressDelivery());
		System.out.println(blinkit.isAppAvailable());
		
		System.out.println("zomato");
		System.out.println(blinkit.getZomato().getServices());
		System.out.println(blinkit.getZomato().getFounded());
		System.out.println(blinkit.getZomato().getEmployees());
		System.out.println(blinkit.getZomato().getRevenue());
		System.out.println(blinkit.getZomato().getExpressDelivery());
		System.out.println(blinkit.getZomato().isAppAvailable());
		
		System.out.println("swiggy");
		System.out.println(blinkit.getSwiggy().getServices());
		System.out.println(blinkit.getSwiggy().getFounded());
		System.out.println(blinkit.getSwiggy().getEmployees());
		System.out.println(blinkit.getSwiggy().getRevenue());
		System.out.println(blinkit.getSwiggy().getExpressDelivery());
		System.out.println(blinkit.getSwiggy().isAppAvailable());
		
	}

}
