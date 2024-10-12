package com.xworkz.sweets.boot;

import com.xworkz.sweets.bridge.SweetInterface;

public class MysorePack implements SweetInterface {

	public String sweetName() {
		System.out.println("MysorePack sweet name");
		return "jalebi";
	}

	public int cost() {
		System.out.println("MysorePack sweet cost");
		return 50;
	}

	public double kiloGram() {
		System.out.println("MysorePack sweet kg");
		return 1.0d;
	}

	public String brand() {
		System.out.println("MysorePack sweet brand");
		return "nandini";
	}

}
