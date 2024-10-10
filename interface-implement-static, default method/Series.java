package com.xworkz.webSeries.boot;

public class Series implements WebSeries{

	@Override
	public String directorName() {
		return "chui san";
	}

	@Override
	public boolean isShooting() {
		return true;
	}

	@Override
	public String producerName() {
		return "chan yee";
	}

	@Override
	public int payment() {
		return 30000;
	}

	@Override
	public int listOfEpisode() {
		return 30;
	}

	@Override
	public double directors() {
		return 30.0d;
	}

	@Override
	public float seriesInvestment() {
		return 50.0f;
	}

	@Override
	public char symbol() {
		return 'Y';
	}

	@Override
	public long producerNo() {
		return 897658987l;
	}

	@Override
	public String heroName() {
		return "hang hui";
	}

}
