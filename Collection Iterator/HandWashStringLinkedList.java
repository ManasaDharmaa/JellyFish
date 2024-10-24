package com.xworkz.handWash.runner;

import java.util.Iterator;
import java.util.LinkedList;

public class HandWashStringLinkedList {

	public static void main(String[] args) {

		LinkedList<String> set = new LinkedList<String>();

		set.add("Godrej");
		set.add("Himalaya");
		set.add("The Love Co");
		set.add("Fiama");

		Iterator<String> iterator = set.iterator();
		System.out.println(set.size());
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
		System.out.println(set.size());
		set.remove("Himalaya");
		System.out.println(set.size());

		set.removeAll(set);
		System.out.println(set.size());

	}

}
