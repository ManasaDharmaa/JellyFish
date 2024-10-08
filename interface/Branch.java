package com.xworkz.collage.boot;

public class Branch implements Collage {

	public void name() {
		System.out.println("collage Name");
	}

	public void classRoom(){
		System.out.println("class room");
	}

	public void office(){
		System.out.println("office");
	}

	public String principalName(){
		return "principal name";
	}

	public int fee(){
		return 50000;
	}

}
