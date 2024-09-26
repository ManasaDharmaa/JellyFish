package com.xworkz.papad.boot;

public class Papad {

	
	String brand;
	int  cost;
	char symbol;
	double weight;
	float deliveryCharges;
	long customerCare;
	boolean isOnlineDeliveryIsAvailable;
	
	
	public Papad() {
		System.out.println("this is default constructor overloding");
	}
	public Papad(String brand) {
		System.out.println("this is one argument constructor overloding");
	}
	public Papad(String brand, int  cost) {
		System.out.println("this is two argument constructor overloding");
	}
	public Papad(String brand, int  cost, char symbol) {
		System.out.println("this is three argument constructor overloding");
	}
	public Papad(String brand, int  cost, char symbol, double weight) {
		System.out.println("this is four argument constructor overloding");
	}
	public Papad(String brand, int  cost, char symbol, double weight, float deliveryCharges) {
		System.out.println("this is five argument constructor overloding");
	}
	public Papad(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare) {
		System.out.println("this is six argument constructor overloding");
	}
	public Papad(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare, boolean isOnlineDeliveryIsAvailable) {
		System.out.println("this is seven argument constructor overloding");
	}
	
	
	public void apala() {
		System.out.println("this is default overloding polymorphism");
	}
	public String apala(String brand) {
		return brand;
	}
	public int apala(String brand, int  cost) {
		return cost;
	}
	public char apala(String brand, int  cost, char symbol) {
		return symbol;
	}
	public double apala(String brand, int  cost, char symbol, double weight) {
		return weight;
	}
	public float apala(String brand, int  cost, char symbol, double weight, float deliveryCharges) {
		return deliveryCharges;
	}
	public long apala(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare) {
		return customerCare;
	}
	public boolean apala(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare, boolean isOnlineDeliveryIsAvailable) {
		return isOnlineDeliveryIsAvailable;
	}

}
