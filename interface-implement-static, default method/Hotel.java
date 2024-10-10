package com.xworkz.hotel.boot;

public interface Hotel {

	String name = "Asha";
	int addedItemsInMenu = 30;
	double noOfStats = 10.0d;
	float minimumCost = 30.0f;
	long hotelNum = 9980764567l;

	String name();

	boolean isOpenOrCost();

	String manager();

	int food();

	int menu();

	double table();

	float waiter();

	char symbol();

	long hotelOwnerNumber();

	String OwenerName();

	default String hotelName(String hotelName) {
		return name;
	}

	default int itemsList(int numberOfItems) {
		return addedItemsInMenu;
	}

	default int itemsList() {
		return addedItemsInMenu;
	}

	default String managerName() {
		return "Sheela";
	}

	default double noOfSweets() {
		return addedItemsInMenu;
	}

	default double noOfSpyceFood() {
		return 99.0d;
	}

	default float maxFoodCost() {
		return 500.0f;
	}

	default long noOfHotel() {
		return hotelNum;
	}

	default float price() {
		return 77.0f;
	}

	default long mngerNo() {
		return 8976549826l;
	}

	static String nameOfhtl(String hotelName) {
		return name;
	}

	static int menuList(int numberOfItems) {
		return addedItemsInMenu;
	}

	static int noOffoodInMenu() {
		return addedItemsInMenu;
	}

	static String nameOfManager() {
		return "Sheela";
	}

	static double sweetsCost() {
		return addedItemsInMenu;
	}

	static double spicyFood() {
		return 99.0d;
	}

	static float cost() {
		return minimumCost;
	}

	static long managerNumber() {
		return hotelNum;
	}

	static float minCost() {
		return 77.0f;
	}

	static long htlNo() {
		return 8976549826l;
	}

}
