package com.xworkz.forest.boot;

import com.xworkz.forest.bridge.ZooInterface;

public class Monkey implements ZooInterface{

	public String zooName() {
		System.out.println("zoo name for monkey class ");
		return null;
	}

	public String managerName() {
		System.out.println("manager name for monkey class ");
		return null;
	}

	public int totalAnimals() {
		System.out.println("total animals for monkey class ");
		return 0;
	}

	public int typeOfAnimals() {
		System.out.println("type of animals for monkey class ");
		return 0;
	}

}
