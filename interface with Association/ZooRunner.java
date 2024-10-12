package com.xworkz.forest.runner;

import java.util.Iterator;

import com.xworkz.forest.boot.Elephent;
import com.xworkz.forest.boot.Forest;
import com.xworkz.forest.boot.Monkey;
import com.xworkz.forest.bridge.ZooInterface;

public class ZooRunner {
	
	public static void main(String[] args) {
		
		ZooInterface monkey = new Monkey();
		ZooInterface elephent = new Elephent();
		
		monkey.managerName();
		monkey.totalAnimals();
		monkey.typeOfAnimals();
		monkey.zooName();
		
		elephent.managerName();
		elephent.totalAnimals();
		elephent.typeOfAnimals();
		elephent.zooName();
		
		Forest forest = new Forest();
		
		forest.setZooInterface(monkey);
		forest.zooInterface.managerName();
		forest.zooInterface.totalAnimals();
		forest.zooInterface.typeOfAnimals();
		forest.zooInterface.zooName();
		
		
		forest.setZooInterface(elephent);
		forest.zooInterface.managerName();
		forest.zooInterface.totalAnimals();
		forest.zooInterface.typeOfAnimals();
		forest.zooInterface.zooName();
		
		
	}

}
