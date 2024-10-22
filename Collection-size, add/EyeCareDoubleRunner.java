package com.xworkz.eyeCare.runner;

import java.util.Collection;
import java.util.LinkedList;

public class EyeCareDoubleRunner {
	
	public static void main(String[] args) {
		
		Collection<Double> collection = new LinkedList<Double>();
		
		collection.add(190.0d);
		collection.add(88.0d);
		collection.add(230.0d);
		collection.add(543.0d);
		collection.add(123.0d);
		
		System.out.println("size of double values : "+ collection.size());
	}

}
