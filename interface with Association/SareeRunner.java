package com.xworkz.saree.runner;

import com.xworkz.saree.boot.Kanchivaram;
import com.xworkz.saree.boot.Lehenga;
import com.xworkz.saree.boot.MysoreSilk;
import com.xworkz.saree.bridge.SareeInterface;

public class SareeRunner {
	
	public static void main(String[] args) {
		
		SareeInterface mysore = new MysoreSilk();
		SareeInterface kanchivaram = new Kanchivaram();
		
		mysore.border();
		mysore.discount();
		mysore.mrpCost();
		mysore.withBlousePiece();
		
		kanchivaram.border();
		kanchivaram.discount();
		kanchivaram.mrpCost();
		kanchivaram.withBlousePiece();
		
		Lehenga lehenga = new Lehenga();
		
		lehenga.setSareeInterface(mysore);
		
		lehenga.sareeInterface.border();
		lehenga.sareeInterface.discount();
		lehenga.sareeInterface.mrpCost();
		lehenga.sareeInterface.withBlousePiece();
		
		lehenga.setSareeInterface(kanchivaram);
		
		lehenga.sareeInterface.border();
		lehenga.sareeInterface.discount();
		lehenga.sareeInterface.mrpCost();
		lehenga.sareeInterface.withBlousePiece();
	}

}
