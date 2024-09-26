package com.xworks.makhana.boot;

public class Makhana {
	
	String brand;
	int  cost;
	char symbol;
	double weight;
	float deliveryCharges;
	long customerCare;
	boolean isOnlineDeliveryIsAvailable;
	
	
	public Makhana() {
		System.out.println("this is default constructor overloding");
	}
	public Makhana(String brand) {
		System.out.println("this is one argument constructor overloding");
	}
	public Makhana(String brand, int  cost) {
		System.out.println("this is two argument constructor overloding");
	}
	public Makhana(String brand, int  cost, char symbol) {
		System.out.println("this is three argument constructor overloding");
	}
	public Makhana(String brand, int  cost, char symbol, double weight) {
		System.out.println("this is four argument constructor overloding");
	}
	public Makhana(String brand, int  cost, char symbol, double weight, float deliveryCharges) {
		System.out.println("this is five argument constructor overloding");
	}
	public Makhana(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare) {
		System.out.println("this is six argument constructor overloding");
	}
	public Makhana(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare, boolean isOnlineDeliveryIsAvailable) {
		System.out.println("this is seven argument constructor overloding");
	}
	
	
	public void lotusSeed() {
		System.out.println("this is default overloding polymorphism");
	}
	public String lotusSeed(String brand) {
		return brand;
	}
	public int lotusSeed(String brand, int  cost) {
		return cost;
	}
	public char lotusSeed(String brand, int  cost, char symbol) {
		return symbol;
	}
	public double lotusSeed(String brand, int  cost, char symbol, double weight) {
		return weight;
	}
	public float lotusSeed(String brand, int  cost, char symbol, double weight, float deliveryCharges) {
		return deliveryCharges;
	}
	public long lotusSeed(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare) {
		return customerCare;
	}
	public boolean lotusSeed(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare, boolean isOnlineDeliveryIsAvailable) {
		return isOnlineDeliveryIsAvailable;
	}


}
