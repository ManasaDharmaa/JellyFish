package com.xworkz.handWash.runner;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HandWashDoubleLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<Double> list = new LinkedHashSet<Double>();

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
