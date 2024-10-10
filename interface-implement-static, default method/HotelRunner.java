package com.xworkz.hotel.runner;

import com.xworkz.hotel.boot.Cafe;
import com.xworkz.hotel.boot.Hotel;

public class HotelRunner {

	public static void main(String[] args) {

		Hotel hotel = new Cafe();

		System.out.println(hotel.food());
		System.out.println(hotel.hotelName("Sheela"));
		System.out.println(hotel.hotelOwnerNumber());
		System.out.println(hotel.isOpenOrCost());
		System.out.println(hotel.itemsList());
		System.out.println(hotel.itemsList(30));
		System.out.println(hotel.manager());
		System.out.println(hotel.managerName());
		System.out.println(hotel.maxFoodCost());
		System.out.println(hotel.mngerNo());
		System.out.println(hotel.name());
		System.out.println(hotel.noOfHotel());
		System.out.println(hotel.noOfSpyceFood());
		System.out.println(hotel.noOfSweets());
		System.out.println(hotel.OwenerName());
		System.out.println(hotel.price());
		System.out.println(hotel.symbol());
		System.out.println(hotel.table());
		System.out.println(hotel.waiter());
		System.out.println(hotel.menu());
		System.out.println(hotel.food());
		System.out.println(hotel.food());
		System.out.println(hotel.food());
		System.out.println(hotel.food());

	}

}
