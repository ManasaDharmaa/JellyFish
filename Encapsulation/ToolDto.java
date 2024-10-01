package com.xworkz.tools.dto;

public class ToolDto {
	
	private String toolBrand;
	private String toolName;
	private int cost;
	private int manufactureYear;
	
	public ToolDto() {
		
		
	}
	
	public ToolDto(String toolBrand, String toolName, int cost, int manufactureYear) {
		super();
		this.toolBrand = toolBrand;
		this.toolName = toolName;
		this.cost = cost;
		this.manufactureYear = manufactureYear;
	}
	

	public String getToolBrand() {
		return toolBrand;
	}

	public String getToolName() {
		return toolName;
	}

	public int getCost() {
		return cost;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public void setToolBrand(String toolBrand) {
		this.toolBrand = toolBrand;
	}

	public void setToolName(String toolName) {
		this.toolName = toolName;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + manufactureYear;
		result = prime * result + ((toolBrand == null) ? 0 : toolBrand.hashCode());
		result = prime * result + ((toolName == null) ? 0 : toolName.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToolDto other = (ToolDto) obj;
		if (cost != other.cost)
			return false;
		if (manufactureYear != other.manufactureYear)
			return false;
		if (toolBrand == null) {
			if (other.toolBrand != null)
				return false;
		} else if (!toolBrand.equals(other.toolBrand))
			return false;
		if (toolName == null) {
			if (other.toolName != null)
				return false;
		} else if (!toolName.equals(other.toolName))
			return false;
		return true;
	}

	
	public String toString() {
		return "ToolDto [toolBrand=" + toolBrand + ", toolName=" + toolName + ", cost=" + cost + ", manufactureYear="
				+ manufactureYear + "]";
	}
	
	
	

}
