package com.xworkz.chips.boot;

public class PotetoChips {
	
	String brand;
	int  cost;
	char symbol;
	double weight;
	float deliveryCharges;
	long customerCare;
	boolean isOnlineDeliveryIsAvailable;
	
	
	public PotetoChips() {
		System.out.println("this is default constructor overloding");
	}
	public PotetoChips(String brand) {
		System.out.println("this is one argument constructor overloding");
	}
	public PotetoChips(String brand, int  cost) {
		System.out.println("this is two argument constructor overloding");
	}
	public PotetoChips(String brand, int  cost, char symbol) {
		System.out.println("this is three argument constructor overloding");
	}
	public PotetoChips(String brand, int  cost, char symbol, double weight) {
		System.out.println("this is four argument constructor overloding");
	}
	public PotetoChips(String brand, int  cost, char symbol, double weight, float deliveryCharges) {
		System.out.println("this is five argument constructor overloding");
	}
	public PotetoChips(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare) {
		System.out.println("this is six argument constructor overloding");
	}
	public PotetoChips(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare, boolean isOnlineDeliveryIsAvailable) {
		System.out.println("this is seven argument constructor overloding");
	}
	
	
	public void chips() {
		System.out.println("this is default overloding polymorphism");
	}
	public String chips(String brand) {
		return brand;
	}
	public int chips(String brand, int  cost) {
		return cost;
	}
	public char chips(String brand, int  cost, char symbol) {
		return symbol;
	}
	public double chips(String brand, int  cost, char symbol, double weight) {
		return weight;
	}
	public float chips(String brand, int  cost, char symbol, double weight, float deliveryCharges) {
		return deliveryCharges;
	}
	public long chips(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare) {
		return customerCare;
	}
	public boolean chips(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare, boolean isOnlineDeliveryIsAvailable) {
		return isOnlineDeliveryIsAvailable;
	}

}
