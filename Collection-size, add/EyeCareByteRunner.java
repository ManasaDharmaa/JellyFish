package com.xworkz.eyeCare.runner;

import java.util.Collection;
import java.util.LinkedList;

public class EyeCareByteRunner {
	
	public static void main(String[] args) {

		Collection<Byte> collection = new LinkedList<Byte>();

		collection.add((byte)4);
		collection.add((byte)56);
		collection.add((byte)120);
		collection.add((byte)76);
		collection.add((byte) 67);

		System.out.println("size of Byte values : " + collection.size());
	}


}
