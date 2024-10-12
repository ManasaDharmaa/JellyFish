package com.xworkz.sweets.boot;

import com.xworkz.sweets.bridge.SweetInterface;

public class Peda implements SweetInterface{

	public String sweetName() {
		System.out.println("peda sweet name");
		return "peda";
	}

	public int cost() {
		System.out.println("peda sweet cost");
		return 80;
	}

	public double kiloGram() {
		System.out.println("peda sweet Kg");
		return 0.30d;
	}

	public String brand() {
		System.out.println("peda sweet brand");
		return "Haldi Ram";
	}

}
