package com.xworkz.hotel.boot;

public class Cafe implements Hotel {

	@Override
	public String name() {
		return "Sandya";
	}

	@Override
	public boolean isOpenOrCost() {
		return true;
	}

	@Override
	public String manager() {
		return "Sudha";
	}

	@Override
	public int food() {
		return 17;
	}

	@Override
	public int menu() {
		return 90;
	}

	@Override
	public double table() {
		return 0;
	}

	@Override
	public float waiter() {
		return 70.7f;
	}

	@Override
	public char symbol() {
		return 'A';
	}

	@Override
	public long hotelOwnerNumber() {
		return 9087654327l;
	}

	@Override
	public String OwenerName() {
		return null;
	}

}
