package com.xworkz.handWash.runner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HandWashDoubleHashSet {

	public static void main(String[] args) {

		HashSet<Double> list = new HashSet<Double>();

		list.add(57.0d);
		list.add(92.0d);
		list.add(73.0d);
		list.add(23.0d);
		list.add(19.0d);

		System.out.println(list.size());

		Iterator<Double> iterator = list.iterator();

		while (iterator.hasNext()) {
			Double value = iterator.next();
			System.out.println(value);
		}

		System.out.println(list.size());
		list.remove(19.0d);
		System.out.println(list.size());

		list.removeAll(list);
		System.out.println(list.size());
	}

}
