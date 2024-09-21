package com.xworkz.studio.boot;

public class Photo {
	
	public String cameraName; 
	public int  price; 
	public double imageBuffer; 
	public float pixelDepth;
	public char type; 
	public boolean isQulity; 
	public long contactNo; 
	public Picture picture;
	
	
	
	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public String getCameraName() {
		return cameraName;
	}
	
	public void setCameraName(String cameraName) {
		this.cameraName = cameraName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getImageBuffer() {
		return imageBuffer;
	}
	
	public void setImageBuffer(double imageBuffer) {
		this.imageBuffer = imageBuffer;
	}
	
	public float getPixelDepth() {
		return pixelDepth;
	}
	
	public void setPixelDepth(float pixelDepth) {
		this.pixelDepth = pixelDepth;
	}
	
	public char getType() {
		return type;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	public boolean isQulity() {
		return isQulity;
	}
	
	public void setQulity(boolean isQulity) {
		this.isQulity = isQulity;
	}
	
	public long getContactNo() {
		return contactNo;
	}
	
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
}
