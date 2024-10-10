package com.xworkz.webSeries.boot;

public interface WebSeries {
	
	String name = "Skate Into Love";
	int investment = 3890000;
	double cost = 1078000.0d;
	float episodes = 30.0f;
	long producerNumber = 9980764567l;

	String directorName();

	boolean isShooting();

	String producerName();

	int payment();

	int listOfEpisode();

	double directors();

	float seriesInvestment();

	char symbol();

	long producerNo();

	String heroName();

	default String nameOfDirector() {
		return "chin yo";
	}

	default int sriesInvst() {
		return 50000500;
	}

	default int totalSeriesEp() {
		return 40;
	}

	default String producerNme() {
		return "Sheela";
	}

	default double hitSeries() {
		return 15.0d;
	}

	default double awardWinningSeies() {
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

	static int producerInvestment() {
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

	static double seriesWeekSuccess() {
		return 99000.0d;
	}

	static float seriesRating() {
		return 4.7f;
	}

	static long directorNo() {
		return 8909765508l;
	}

	static float seriesSuccess() {
		return 7.0f;
	}

	static long productionHouseNo() {
		return 8976549826l;
	}

}
