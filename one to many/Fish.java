package com.xworkz.sea.boot;

public class Fish {
	
	public String className;
	public int species;
	public double lifTimeVaries;
	public Seaweed seaweed;
	
	
	public Fish(String className, int species, double lifTimeVaries, Seaweed seaweed) {
		super();
		this.className = className;
		this.species = species;
		this.lifTimeVaries = lifTimeVaries;
		this.seaweed = seaweed;
	}


	public String getClassName() {
		return className;
	}


	public int getSpecies() {
		return species;
	}


	public double getLifTimeVaries() {
		return lifTimeVaries;
	}


	public Seaweed getSeaweed() {
		return seaweed;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public void setSpecies(int species) {
		this.species = species;
	}


	public void setLifTimeVaries(double lifTimeVaries) {
		this.lifTimeVaries = lifTimeVaries;
	}


	public void setSeaweed(Seaweed seaweed) {
		this.seaweed = seaweed;
	}
	
	

}
