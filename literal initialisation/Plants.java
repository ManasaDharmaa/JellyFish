package com.xworkz.seeds.boot;

public class Plants extends Seeds{
	
	
	public String getSeedsName() {
		return name;
	}
	public int getSeedsCost() {
		return cost;
	}
	public double getSeedsQuantity() {
		return quantity;
	}
	public boolean isSeedsSeedlings() {
		return isSeedlings;
	}
	public void setSeedsName(String name) {
		super.name = name;
	}
	public void setSeedsCost(int cost) {
		super.cost = cost;
	}
	public void setSeedsQuantity(double quantity) {
		super.quantity = quantity;
	}
	public void setSeedsSeedlings(boolean isSeedlings) {
		super.isSeedlings = isSeedlings;
	}
	
	

}
