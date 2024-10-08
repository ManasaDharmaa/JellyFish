package com.xworkz.hospitals.boot;

public abstract class Hospital {
	
	public abstract void name();

	public abstract void doctor();

	public abstract void numberOfDoctor();

	public abstract void numberOfNurse();

	public abstract void wards();

	public abstract void resaptionist();

	public abstract void medical();

	public abstract void nurse();

	public abstract void chackupRoom();

	public abstract void bed();
	
	public void nameOfDoctor() {
		System.out.println("this is  nameOfDoctor method");
	}

	public void specialist() {
		System.out.println("this is specialist  method");
	}

	public void patents() {
		System.out.println("this is patents method");
	}

	public void timing() {
		System.out.println("this is timing method");
	}

	public void fee() {
		System.out.println("this is fee method");
	}


}
