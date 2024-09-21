package com.xworkz.milk.runner;

import com.xworkz.milk.boot.Butter;

public class MilkRunner {
	
    public static void main(String[] args) {
		
    	
    	Butter butter = new Butter();
    	
    	butter.setBrand("Nandhini");
    	butter.setCost(50);
    	butter.setQuntity(200.0d);
    	butter.setCowMilk(true);
    	
    	butter.setBranName("Milky Mist");
    	butter.setPrice(20);
    	butter.setQty(250.0d);
    	butter.setTickOrTine(true);
    	
    	butter.setBrandName("Ammul");
    	butter.setCostOfBuuter(250);
    	butter.setQnty(500.0d);
    	butter.setTicOrTin(true);
    	
    	
    	System.out.println("milk brand : " + butter.getBrand());
    	System.out.println("milk cost : " + butter.getCost());
    	System.out.println("milk quntity : " + butter.getQuntity());
    	System.out.println("milk is cow milk : " + butter.isCowMilk());
    	
    	System.out.println("curd brand : " + butter.getBranName());
    	System.out.println("curd cost : " + butter.getPrice());
    	System.out.println("curd quntity : " + butter.getQty());
    	System.out.println("curd is tick or tine  : " + butter.isTickOrTine());
    	
    	System.out.println("butter brand : " + butter.getBrandName());
    	System.out.println("butter cost : " + butter.getCostOfBuutter());
    	System.out.println("butter quntity : " + butter.getQntyy());
    	System.out.println("butter is tick or tine : " + butter.isTicOrTin());
    }

}
