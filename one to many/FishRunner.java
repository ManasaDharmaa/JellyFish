package com.xworkz.sea.runner;

import com.xworkz.sea.boot.Fish;
import com.xworkz.sea.boot.Octopus;
import com.xworkz.sea.boot.Seaweed;

public class FishRunner {
	
	public static void main(String [] args) {
		
		
		Seaweed seaweed =	new Seaweed("Salads", 4, 'A');
		Octopus octopus = new Octopus("Octopoda", 15, 8.0d, 450.0f, seaweed);
		Fish Fish = new Fish("Pisces", 30000, 100.0d, seaweed);
		
		
		System.out.println(octopus.getOrder());
		System.out.println(octopus.getArms());
		System.out.println(octopus.getVariesFeet());
		System.out.println(octopus.getVariesLength());
		System.out.println(octopus.getSeaweed().getFoodName());
		System.out.println(octopus.getSeaweed().getTotalTypes());
		System.out.println(octopus.getSeaweed().getVitamins());
		
		System.out.println(Fish.getClassName());
		System.out.println(Fish.getSpecies());
		System.out.println(Fish.getLifTimeVaries());
		System.out.println(Fish.getSeaweed().getFoodName());
		System.out.println(Fish.getSeaweed().getFoodName());
		System.out.println(Fish.getSeaweed().getFoodName());
		
	}

}
