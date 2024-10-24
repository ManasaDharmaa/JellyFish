package com.xworkz.handWash.runner;

import java.util.HashSet;
import java.util.Iterator;

public class HandWashFloatHashSet {

	public static void main(String[] args) {

		HashSet<Float> list = new HashSet<Float>();

		list.add((float) 57.0d);
		list.add((float) 92.0d);
		list.add((float) 73.0d);
		list.add((float) 23.0d);
		list.add((float) 19.0d);

		System.out.println(list.size());

		Iterator<Float> iterator = list.iterator();

		while (iterator.hasNext()) {
			Float value = iterator.next();
			System.out.println(value);
		}

		System.out.println(list.size());
		list.remove(19.0d);
		System.out.println(list.size());

		list.removeAll(list);
		System.out.println(list.size());
	}

}
