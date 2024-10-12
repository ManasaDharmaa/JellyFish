package com.xworkz.blinkit.boot;

import com.xworkz.blinkit.bridge.BlinkItInterface;

public class Snacks implements BlinkItInterface{

	public String itemList() {
		System.out.println("Snacks item list");
		return null;
	}

	public int totalCost() {
		System.out.println("Snacks total cost");
		return 0;
	}

	public double takingTimeForDelivery() {
		System.out.println("Snacks taking Time For Delivery");
		return 0;
	}

	public boolean isDeliveryFree() {
		System.out.println("Snacks is Delivery Free");
		return false;
	}

}
