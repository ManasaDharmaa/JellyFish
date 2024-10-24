package com.xworkz.handWash.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HandWash {
	
	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList<String>();
		
		collection.add("Mysore Sandal");
		collection.add("Santoor");
		collection.add("dattol");
		collection.add("Lifeboy");
		
		Iterator<String> iterable = collection.iterator();
		
		while(iterable.hasNext()) {
			String value = iterable.next();
			System.out.println(value);
		}
		
		
		
	}

}
