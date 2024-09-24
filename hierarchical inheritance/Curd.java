package com.xworkz.milk.boot;

public class Curd extends Milk{
	
	public String branName;
	public int price;
	public double qty;
	public boolean isTickOrTine;
	
	
	public String getBranName() {
		return branName;
	}
	public int getPrice() {
		return price;
	}
	public double getQty() {
		return qty;
	}
	public boolean isTickOrTine() {
		return isTickOrTine;
	}
	public void setBranName(String branName) {
		this.branName = branName;
	}
	public void setPrice(int Price) {
		this.price = Price;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public void setTickOrTine(boolean isTickOrTine) {
		this.isTickOrTine = isTickOrTine;
	}

}
