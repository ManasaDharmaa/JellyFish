package com.xworkz.eyeCare.runner;

import java.util.Collection;
import java.util.LinkedList;

public class EyeIntegerRunner {

	public static void main(String[] args) {

		Collection<Integer> collection = new LinkedList<Integer>();

		collection.add(23);
		collection.add(98);
		collection.add(9876);
		collection.add(789);
		collection.add(456);

		System.out.println("size of Integer values : " + collection.size());
	}

}
