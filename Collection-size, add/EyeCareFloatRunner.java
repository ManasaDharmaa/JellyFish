package com.xworkz.eyeCare.runner;

import java.util.Collection;
import java.util.LinkedList;

public class EyeCareFloatRunner {
	
	public static void main(String[] args) {

		Collection<Float> collection = new LinkedList<Float>();

		collection.add(87.9f);
		collection.add(23.7f);
		collection.add(62.5f);
		collection.add(345.8f);
		collection.add(654.4f);

		System.out.println("size of float values : " + collection.size());
	}


}
