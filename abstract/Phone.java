package com.xworkz.phone.boot;

public abstract class Phone {

	public abstract void battery();

	public abstract void memoryCard();

	public abstract void internalSpace();

	public abstract void simCard();

	public abstract void headPhoneSpace();

	public abstract void chargingSpace();

	public abstract void tourch();

	public abstract void frontCamera();

	public abstract void backCase();

	public abstract void touchScreen();

	public void showingDateAndTime() {
		System.out.println("this is showing Date And Time");
	}

	public void os() {
		System.out.println("this is os method");
	}

	public void softwareApplication() {
		System.out.println("this is software Application");
	}

	public void screenLock() {
		System.out.println("this is ScreenLock");
	}

	public void lockScreen() {
		System.out.println("this is lock screen");
	}

}
