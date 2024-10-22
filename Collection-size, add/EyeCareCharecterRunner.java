package com.xworkz.eyeCare.runner;

import java.util.Collection;
import java.util.LinkedList;

public class EyeCareCharecterRunner {

	public static void main(String[] args) {

		Collection<Character> collection = new LinkedList<Character>();

		collection.add('A');
		collection.add('B');
		collection.add('C');
		collection.add('D');
		collection.add('E');

		System.out.println("size of charecter values : " + collection.size());
	}

}
