package com.xworkz.saree.boot;

import com.xworkz.saree.bridge.SareeInterface;

public class MysoreSilk implements SareeInterface{

	public String border() {
		System.out.println("mysore silk border");
		return null;
	}

	public int mrpCost() {
		System.out.println("mysore silk mrp cost");
		return 0;
	}

	public String withBlousePiece() {
		System.out.println("mysore silk saree with blouse piece");
		return null;
	}

	public int discount() {
		System.out.println("mysore silk saree discount");
		return 0;
	}
	
	

}
