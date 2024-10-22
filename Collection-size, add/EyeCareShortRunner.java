package com.xworkz.eyeCare.runner;

import java.util.Collection;
import java.util.LinkedList;

public class EyeCareShortRunner {

	public static void main(String[] args) {

		Collection<Short> collection = new LinkedList<Short>();

		collection.add((short) 56);
		collection.add((short) 654);
		collection.add((short) 12);
		collection.add((short) 987);
		collection.add((short) 876);

		System.out.println("size of short values : " + collection.size());
	}

}
