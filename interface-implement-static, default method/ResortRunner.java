package com.xworkz.resort.runner;

import com.xworkz.resort.boot.HomeStay;
import com.xworkz.resort.boot.Resort;

public class ResortRunner {
	
	public static void main(String[] args) {

		Resort resort = new HomeStay();

		System.out.println(resort.food());
		System.out.println(resort.resortName("Sheela"));
		System.out.println(resort.resortOwnerNumber());
		System.out.println(resort.isOpenOrCost());
		System.out.println(resort.itemsList());
		System.out.println(resort.itemsList(30));
		System.out.println(resort.manager());
		System.out.println(resort.managerName());
		System.out.println(resort.maxFoodCost());
		System.out.println(resort.mngerNo());
		System.out.println(resort.name());
		System.out.println(resort.noOfHotel());
		System.out.println(resort.noOfSpyceFood());
		System.out.println(resort.noOfSweets());
		System.out.println(resort.OwenerName());
		System.out.println(resort.price());
		System.out.println(resort.symbol());
		System.out.println(resort.table());
		System.out.println(resort.waiter());
		System.out.println(resort.menu());
		

	}

}
