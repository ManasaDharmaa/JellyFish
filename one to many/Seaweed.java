package com.xworkz.sea.boot;

public class Seaweed {
	
	public String foodName;
	public int totalTypes;
	public char vitamins;
	
	
	
	
	public Seaweed(String foodName, int totalTypes, char vitamins) {
		super();
		this.foodName = foodName;
		this.totalTypes = totalTypes;
		this.vitamins = vitamins;
	}
	
	
	public String getFoodName() {
		return foodName;
	}
	public int getTotalTypes() {
		return totalTypes;
	}
	public char getVitamins() {
		return vitamins;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public void setTotalTypes(int totalTypes) {
		this.totalTypes = totalTypes;
	}
	public void setVitamins(char vitamins) {
		this.vitamins = vitamins;
	}
	
	

}
