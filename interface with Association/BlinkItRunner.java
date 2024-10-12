package com.xworkz.blinkit.runner;

import com.xworkz.blinkit.boot.Amazon;
import com.xworkz.blinkit.boot.Grocery;
import com.xworkz.blinkit.boot.Snacks;
import com.xworkz.blinkit.bridge.BlinkItInterface;

public class BlinkItRunner {
	
	public static void main(String[] args) {
		
		BlinkItInterface grocery = new Grocery();
		BlinkItInterface snacks = new Snacks();
		
		grocery.isDeliveryFree();
		grocery.itemList();
		grocery.takingTimeForDelivery();
		grocery.totalCost();
		
		snacks.isDeliveryFree();
		snacks.itemList();
		snacks.takingTimeForDelivery();
		snacks.totalCost();
		
		Amazon amazon = new Amazon();
		
		amazon.setInterface1(grocery);
		
		amazon.interface1.isDeliveryFree();
		amazon.interface1.itemList();
		amazon.interface1.takingTimeForDelivery();
		amazon.interface1.totalCost();
		
		amazon.setInterface1(snacks);
		
		amazon.interface1.isDeliveryFree();
		amazon.interface1.itemList();
		amazon.interface1.takingTimeForDelivery();
		amazon.interface1.totalCost();
		
	}

}
