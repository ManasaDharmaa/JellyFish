package com.xworkz.handWash.runner;

import java.util.Iterator;
import java.util.LinkedList;

public class HandWashIntegerLinkedList {
	
public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(67);
		list.add(82);
		list.add(7);
		list.add(53);
		list.add(89);
		
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
