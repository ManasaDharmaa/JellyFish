package com.xworkz.studio.runner;

import com.xworkz.studio.boot.Almond;
import com.xworkz.studio.boot.Walnuts;

public class AlmondRunner {
	
	
	public static void main(String [] args) {
		
		Almond almond = new Almond();
		Walnuts walnuts = new Walnuts();
		
		almond.setBrand("Valleys Premium Kashmiri Badam");
		almond.setCost(949);
		almond.setWeight(250.0d);
		almond.setRating(4.2f);
		almond.setOnSale(true);
		almond.setTypes('A');
		almond.setWalnuts(walnuts);
		
		almond.walnuts.setBrand("Planters");
		almond.walnuts.setCost(1140);
		almond.walnuts.setWeight(950.0d);
		almond.walnuts.setRating(4.4f);
		almond.walnuts.setTypes('W');
		almond.walnuts.setOnSale(true);
		
		
		System.out.println("almond brand name : "+ almond.getBrand());
		System.out.println("almond cost : "+ almond.getCost());
		System.out.println("almond weigth : "+ almond.getWeight());
		System.out.println("rating : "+ almond.getRating());
		System.out.println("almond type : "+ almond.getTypes());
		System.out.println("almond is on sale : "+ almond.isOnSale());
		
		
		System.out.println("walnuts brand name : "+ almond.walnuts.getBrand());
		System.out.println("walnuts cost : "+ almond.walnuts.getCost());
		System.out.println("walnuts weight : "+ almond.walnuts.getWeight());
		System.out.println("rating : "+ almond.walnuts.getRating());
		System.out.println("walnuts type : "+ almond.walnuts.getTypes());
		System.out.println("walnuts is on sale : "+ almond.walnuts.isOnSale());
	}

}
