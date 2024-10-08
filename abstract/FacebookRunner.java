package com.xworkz.facebook.runner;

import com.xworkz.facebook.boot.Messenger;

public class FacebookRunner {
	
	public static void main(String[] args) {
		
		Messenger messenger = new Messenger();
		
		messenger.comments();
		messenger.contact();
		messenger.createGroup();
		messenger.followe();
		messenger.freiend();
		messenger.groupChat();
		messenger.likes();
		messenger.liveStreaming();
		messenger.makeFriends();
		messenger.newsFeed();
		messenger.profile();
		messenger.profileDetails();
		messenger.search();
		messenger.shares();
		messenger.statusUpdate();
		messenger.story();
		messenger.voiceCalls();
	}

}
