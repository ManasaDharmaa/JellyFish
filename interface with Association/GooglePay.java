package com.xworkz.upiApps.boot;

import com.xworkz.upiApps.bridge.UPIInterface;

public class GooglePay implements UPIInterface{

	public String id() {
		System.out.println("Google pay id");
		return null;
	}

	public int number() {
		System.out.println("Google pay number");
		return 0;
	}

	public boolean isAutoPay() {
		System.out.println("Google pay is auto pay");
		return false;
	}

	public String bank() {
		System.out.println("Google pay bank");
		return null;
	}

}
