package com.xworkz.onlineShoppingApps.boot;

public interface OnlineShoppingApps {
	
	String nameOfApp = "Amezone";
	int dailyProfite = 3890000;
	double dailyLose = 0.0d;
	float dailyUpdates = 30.0f;
	long customerCare = 9980764567l;

	String appName();

	boolean isOnlineDeliveryAvailable();

	String dailyUpdates();

	int payment();

	int listOfThinks();

	double cart();

	float itemsList();

	char categories();

	long addToFev();

	String buyItOption();

	default String applicationName() {
		return "Myntra";
	}

	default int categorie() {
		return 10;
	}

	default int fevList() {
		return 10;
	}

	default String products() {
		return "Beauty, fashion, mobile";
	}

	default double cosmatics() {
		return 150.0d;
	}

	default double grosaries() {
		return 100.0d;
	}

	default float cloths() {
		return 50000.0f;
	}

	default long cstmrCare() {
		return 8976549076l;
	}

	default float toys() {
		return 77000.0f;
	}

	default long typesOfMobiles() {
		return 89l;
	}

	static boolean prime() {
		return true;
	}

	static boolean giftCards() {
		return true;
	}

	static int furniture() {
		return 15;
	}

	static String pharmacy() {
		return "medicin";
	}

	static double travel() {
		return 340000.0d;
	}

	static boolean movieTicketBooking() {
		return true;
	}

	static float movieRating() {
		return 4.7f;
	}

	static long electronics() {
		return 50l;
	}

	static float beauty() {
		return 7.0f;
	}

	static long amazonPay() {
		return 897l;
	}

	

	
	

}
