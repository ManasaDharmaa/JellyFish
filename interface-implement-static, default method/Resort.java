package com.xworkz.resort.boot;

public interface Resort {
	
	String name = "Asha";
	int addedItemsInMenu = 30;
	double noOfStats = 10.0d;
	float minimumCost = 30.0f;
	long resortNum = 9980764567l;

	String name();

	boolean isOpenOrCost();

	String manager();

	int food();

	int menu();

	double table();

	float waiter();

	char symbol();

	long resortOwnerNumber();

	String OwenerName();

	default String resortName(String hotelName) {
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
		return resortNum;
	}

	default float price() {
		return 77.0f;
	}

	default long mngerNo() {
		return 8976549826l;
	}

	static String nameOfhtl(String resortName) {
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
		return resortNum;
	}

	static float minCost() {
		return 77.0f;
	}

	static long resortNo() {
		return 8976549826l;
	}


}
