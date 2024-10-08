package com.xworkz.facebook.boot;

public abstract class Facebook {
	
	public abstract void story();
	public abstract void comments();
	public abstract void likes();
	public abstract void freiend(); 
	public abstract void followe();
	public abstract void contact();
	public abstract void profile();
	public abstract void statusUpdate();
	public abstract void groupChat();
	public abstract void voiceCalls();
	
	public void profileDetails() {
		System.out.println("This is profileDetails");
	}
	
	public void makeFriends() {
		System.out.println("This is makeFriends");
	}
	
	public void newsFeed() {
		System.out.println("This is newsFeed");
	}
	
	public void createGroup() {
		System.out.println("This is createGroup");
	}
	public void liveStreaming() {
		System.out.println("This is liveStreaming");
	}
	
	

}
