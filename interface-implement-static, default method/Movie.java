package com.xworkz.productionHouse.boot;

public class Movie implements ProductionHouse {

	@Override
	public String houseName() {
		return "Hombale";
	}

	@Override
	public boolean isShooting() {
		return true;
	}

	@Override
	public String producerName() {
		return "Ramesh";
	}

	@Override
	public int payment() {
		return 9088000;
	}

	@Override
	public int listOfMovie() {
			return 10;
	}

	@Override
	public double directors() {
		return 1.0d;
	}

	@Override
	public float movieInvestment() {
		return 5000000.0f;
	}

	@Override
	public char symbol() {
		return 'H';
	}

	@Override
	public long producerNo() {
		return 8907654768l;
	}

	@Override
	public String derectorName() {
	return "NTR";
	}

}
