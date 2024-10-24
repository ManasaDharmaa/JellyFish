package com.xworkz.handWash.runner;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HandWashFloatLinkedHashSet {
	
	public static void main(String[] args) {

		LinkedHashSet<Float> list = new LinkedHashSet<Float>();

		list.add(57.0f);
		list.add(92.0f);
		list.add(73.0f);
		list.add(23.0f);
		list.add(19.0f);

		System.out.println(list.size());

		Iterator<Float> iterator = list.iterator();

		while (iterator.hasNext()) {
			Float value = iterator.next();
			System.out.println(value);
		}

		System.out.println(list.size());
		list.remove(19.0f);
		System.out.println(list.size());

		list.removeAll(list);
		System.out.println(list.size());
	}


}
