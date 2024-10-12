package com.xworkz.forest.boot;

import com.xworkz.forest.bridge.ZooInterface;

public class Elephent implements ZooInterface{

	public String zooName() {
		System.out.println("zoo name for Elephent class ");
		return null;
	}

	public String managerName() {
		System.out.println("manager name for Elephent class ");
		return null;
	}

	public int totalAnimals() {
		System.out.println("total animal for Elephent class ");
		return 0;
	}

	public int typeOfAnimals() {
		System.out.println("type of animals for Elephent class ");
		return 0;
	}

}
