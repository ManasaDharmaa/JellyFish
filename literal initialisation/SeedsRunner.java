package com.xworkz.seeds.runner;

import com.xworkz.seeds.boot.Plants;

public class SeedsRunner {
	
	public static void main(String[] args) {
		
		Plants plants = new Plants();
		
		plants.setName("pumpkin");
		plants.setCost(193);
		plants.setQuantity(250.0d);
		plants.setSeedlings(false);
		
		plants.setSeedsName("pumpkin plants");
		plants.setSeedsCost(360);
		plants.setSeedsQuantity(200.0d);
		plants.setSeedsSeedlings(false);
		
		System.out.println(plants.getName());
		System.out.println(plants.getCost());
		System.out.println(plants.getQuantity());
		System.out.println(plants.isSeedlings());
		
		System.out.println(plants.getSeedsName());
		System.out.println(plants.getSeedsCost());
		System.out.println(plants.getSeedsQuantity());
		System.out.println(plants.isSeedsSeedlings());
		
	}

}
