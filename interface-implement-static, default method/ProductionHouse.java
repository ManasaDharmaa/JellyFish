package com.xworkz.productionHouse.boot;

public interface ProductionHouse {

	String name = "Rishabh";
	int investment = 3890000;
	double cost = 1078000.0d;
	float movies = 30.0f;
	long producerNumber = 9980764567l;

	String houseName();

	boolean isShooting();

	String producerName();

	int payment();

	int listOfMovie();

	double directors();

	float movieInvestment();

	char symbol();

	long producerNo();

	String derectorName();

	default String directorName(String directorName) {
		return name;
	}

	default int movieInvestment(int investment) {
		return 50000500;
	}

	default int totalMovies() {
		return 40;
	}

	default String producerNme() {
		return "Sheela";
	}

	default double hitMovies() {
		return 15.0d;
	}

	default double awardWinningMovie() {
		return 10.0d;
	}

	default float heroPayment() {
		return 50000.0f;
	}

	default long heroNo() {
		return 8976549076l;
	}

	default float heroinPayment() {
		return 77000.0f;
	}

	default long heroinNo() {
		return 8976549826l;
	}

	static String hero() {
		return "Dharshan";
	}

	static int producerInvestment(int investment) {
		return 120000;
	}

	static int directorInvestment() {
		return 560000;
	}

	static String heroinName() {
		return "Shreelila";
	}

	static double directorfee() {
		return 340000.0d;
	}

	static double movieWeekSuccess() {
		return 99000.0d;
	}

	static float movieRating() {
		return 4.7f;
	}

	static long directorNo() {
		return 8909765508l;
	}

	static float movieSuccess() {
		return 7.0f;
	}

	static long productionHouseNo() {
		return 8976549826l;
	}

}
