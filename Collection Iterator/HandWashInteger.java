package com.xworkz.handWash.runner;

import java.util.ArrayList;
import java.util.Iterator;

public class HandWashInteger {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(87);
		list.add(82);
		list.add(77);
		list.add(23);
		list.add(99);
		
		System.out.println(list.size());
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			System.out.println(value);
		}
		
		System.out.println(list.size());
		
		list.removeAll(list);
		System.out.println(list.size());
	}

}
