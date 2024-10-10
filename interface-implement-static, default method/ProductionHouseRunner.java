package com.xworkz.productionHouse.runner;

import com.xworkz.productionHouse.boot.Movie;
import com.xworkz.productionHouse.boot.ProductionHouse;

public class ProductionHouseRunner {
	
	public static void main(String[] args) {
		
		ProductionHouse productionHouse = new Movie();

		System.out.println(productionHouse.directorName("Sweety"));
		System.out.println(productionHouse.movieInvestment(3890000));
		System.out.println(productionHouse.producerNme());
		System.out.println(productionHouse.hitMovies());
		System.out.println(productionHouse.awardWinningMovie());
		System.out.println(productionHouse.heroPayment());
		System.out.println(productionHouse.heroNo());
		System.out.println(productionHouse.heroinPayment());
		System.out.println(productionHouse.heroinNo());
		System.out.println(productionHouse.heroinNo());
		System.out.println(productionHouse.houseName());
		System.out.println(productionHouse.isShooting());
		System.out.println(productionHouse.producerName());
		System.out.println(productionHouse.payment());
		System.out.println(productionHouse.listOfMovie());
		System.out.println(productionHouse.directors());
		System.out.println(productionHouse.movieInvestment());
		System.out.println(productionHouse.symbol());
		System.out.println(productionHouse.producerNo());
		System.out.println(productionHouse.derectorName());
	    

	}
}
