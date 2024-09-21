package com.xworkz.studio.boot;

public class Picture {
	
	public String name; // "Beautiful Pictures"
	public int dimensions; // 6000
	public char fileType; // 'J'
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDimensions() {
		return dimensions;
	}
	
	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}
	
	public char getFileType() {
		return fileType;
	}
	
	public void setFileType(char fileType) {
		this.fileType = fileType;
	}

}
