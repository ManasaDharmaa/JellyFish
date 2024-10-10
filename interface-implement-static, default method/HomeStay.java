package com.xworkz.resort.boot;

public class HomeStay implements Resort{

	@Override
	public String name() {
		return "Jaya";
	}

	@Override
	public boolean isOpenOrCost() {
		return true;
	}

	@Override
	public String manager() {
		return "Ashok";
	}

	@Override
	public int food() {
		return 300;
	}

	@Override
	public int menu() {
		return 150;
	}

	@Override
	public double table() {
		return 50.0d;
	}

	@Override
	public float waiter() {
		return 30.0f;
	}

	@Override
	public char symbol() {
		return 'A';
	}

	@Override
	public long resortOwnerNumber() {
		return 9087654321l;
	}

	@Override
	public String OwenerName() {
		return "sheela";
	}

}
