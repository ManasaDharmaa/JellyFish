package com.xworkz.language.dto;

public class LanguageDto {
	
	
	private int cost;
	private String brand;
	
	
	
	public LanguageDto(int cost, String brand) {
		super();
		this.cost = cost;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "LanguageDto [cost=" + cost + ", brand=" + brand + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + cost;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LanguageDto other = (LanguageDto) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cost != other.cost)
			return false;
		return true;
	}

	public int getCost() {
		return cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	

}
