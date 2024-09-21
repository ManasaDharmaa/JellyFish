package com.xworkz.palace.boot;

public class Castle {
	
	String nameOfThePalace;
	Integer noOfPrince;
	Long noOfKing;
	Double noMinisters;
	Float noOfsoldjier;
	Character flogColor;
	Boolean isVisited;
	
	public Castle(String nameOfThePalace,Integer noOfPrince,Long noOfKing,Double noMinisters,Float noOfsoldjier,Character flogColor, Boolean isVisited) {
		
		this.nameOfThePalace = nameOfThePalace;
		this.noOfPrince = noOfPrince;
		this.noOfKing = noOfKing;
		this.noMinisters = noMinisters;
		this.noOfsoldjier = noOfsoldjier;
		this.flogColor = flogColor;
		this.isVisited = isVisited;
	}
	
	public String getNameOfThePalace() {
		return nameOfThePalace;
	}
	public Integer getNoOfPrince() {
		return noOfPrince;
	}
	public Long getNoOfKing() {
		return noOfKing;
	}
	public Double getNoMinisters() {
		return noMinisters;
	}
	public Float getNoOfsoldjier() {
		return noOfsoldjier;
	}
	public Character getFlogColor() {
		return flogColor;
	}
	public Boolean isVisited() {
		return isVisited;
	}

}
