package com.xworkz.eyeCare.runner;

import java.util.Collection;
import java.util.LinkedList;

public class EyeCareStringRunner {
	
	public static void main(String[] args) {
		
		Collection<String> collection = new LinkedList<String>();
		
		collection.add("Krishna");
		collection.add("rama");
		collection.add("sita");
		collection.add("ravana");
		collection.add("lakshmana");
		
		System.out.println(collection.size());
	}

}
