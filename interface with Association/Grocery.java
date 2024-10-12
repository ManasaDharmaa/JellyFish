package com.xworkz.blinkit.boot;

import com.xworkz.blinkit.bridge.BlinkItInterface;

public class Grocery implements BlinkItInterface{

	public String itemList() {
		System.out.println("Grocery item list");
		return null;
	}

	public int totalCost() {
		System.out.println("Grocery total cost");
		return 0;
	}

	public double takingTimeForDelivery() {
		System.out.println("Grocery taking Time For Delivery");
		return 0;
	}

	public boolean isDeliveryFree() {
		System.out.println("Grocery is Delivery Free");
		return false;
	}

}
