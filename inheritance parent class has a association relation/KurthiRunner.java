package com.xworkz.cloths.ruuner;

import com.xworkz.cloths.boot.Dupata;
import com.xworkz.cloths.boot.Jeans;

public class KurthiRunner {
	
	public static void main(String[] args) {
		
		Jeans jeans = new Jeans();
		Dupata dupata = new Dupata();
		
		dupata.setBrand("Ramas kurti jaipur");
		dupata.setCost(1700);
		dupata.setSize('L');
		dupata.setJeans(jeans);
		
		dupata.jeans.setBrand("Aspire Clothing");
		dupata.jeans.setCost(2500);
		dupata.jeans.setSize('M');
		
		System.out.println("brand : "+ dupata.getBrand());
		System.out.println("cost : "+ dupata.getCost());
		System.out.println("size : "+ dupata.getSize());
		
		
		System.out.println("brand : "+ dupata.getJeans().getBrand());
		System.out.println("cost : "+ dupata.getJeans().getCost());
		System.out.println("size : "+ dupata.getJeans().getSize());
		
		
	}

}
