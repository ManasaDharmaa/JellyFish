package com.xworkz.moongDal.boot;

public class MoongDal {
	
	
	String brand;
	int  cost;
	char symbol;
	double weight;
	float deliveryCharges;
	long customerCare;
	boolean isOnlineDeliveryIsAvailable;
	
	
	public MoongDal() {
		System.out.println("this is default constructor overloding");
	}
	public MoongDal(String brand) {
		System.out.println("this is one argument constructor overloding");
	}
	public MoongDal(String brand, int  cost) {
		System.out.println("this is two argument constructor overloding");
	}
	public MoongDal(String brand, int  cost, char symbol) {
		System.out.println("this is three argument constructor overloding");
	}
	public MoongDal(String brand, int  cost, char symbol, double weight) {
		System.out.println("this is four argument constructor overloding");
	}
	public MoongDal(String brand, int  cost, char symbol, double weight, float deliveryCharges) {
		System.out.println("this is five argument constructor overloding");
	}
	public MoongDal(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare) {
		System.out.println("this is six argument constructor overloding");
	}
	public MoongDal(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare, boolean isOnlineDeliveryIsAvailable) {
		System.out.println("this is seven argument constructor overloding");
	}
	
	
	public void namkeen() {
		System.out.println("this is default overloding polymorphism");
	}
	public String namkeen(String brand) {
		return brand;
	}
	public int namkeen(String brand, int  cost) {
		return cost;
	}
	public char namkeen(String brand, int  cost, char symbol) {
		return symbol;
	}
	public double namkeen(String brand, int  cost, char symbol, double weight) {
		return weight;
	}
	public float namkeen(String brand, int  cost, char symbol, double weight, float deliveryCharges) {
		return deliveryCharges;
	}
	public long namkeen(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare) {
		return customerCare;
	}
	public boolean namkeen(String brand, int  cost, char symbol, double weight, float deliveryCharges, long customerCare, boolean isOnlineDeliveryIsAvailable) {
		return isOnlineDeliveryIsAvailable;
	}

}
