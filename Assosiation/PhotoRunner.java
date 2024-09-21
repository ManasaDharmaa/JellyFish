package com.xworkz.studio.runner;

import com.xworkz.studio.boot.Photo;
import com.xworkz.studio.boot.Picture;

public class PhotoRunner {
	
	public static void main(String [] args) {
		
		Picture picture = new Picture();
		Photo photo = new Photo();
		
		photo.setCameraName("LUCID");
		photo.setPrice(152685);
		photo.setImageBuffer(128.0d);
		photo.setPixelDepth(12.0f);
		photo.setType('J');
		photo.setQulity(true);
		photo.setContactNo(8068450000l);
		photo.setPicture(picture);
		photo.picture.setName("sun");
		photo.picture.setDimensions(243);
		photo.picture.setFileType('J');
		
		
		System.out.println("camera name  : " + photo.getCameraName());
		System.out.println("price : " + photo.getPrice());
		System.out.println("Image buffer : " + photo.getImageBuffer());
		System.out.println("Pixel Depth : " + photo.getPixelDepth());
		System.out.println("Type : " + photo.getType());
		System.out.println("qulity : " + photo.isQulity());
		System.out.println("contact number : "+ photo.getContactNo());
		System.out.println("picture name : " + photo.picture.getName());
		System.out.println("picture Dimensions : "+ photo.picture.getDimensions());
		System.out.println("picture File Type : "+ photo.picture.getFileType());
		
		
		
	}

}
