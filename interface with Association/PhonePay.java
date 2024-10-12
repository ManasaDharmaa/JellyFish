package com.xworkz.upiApps.boot;

import com.xworkz.upiApps.bridge.UPIInterface;

public class PhonePay implements UPIInterface{

	public String id() {
	   System.out.println("Phone Pay  id");
		return null;
	}

	public int number() {
		System.out.println("Phone Pay  number");
		return 0;
	}

	public boolean isAutoPay() {
		System.out.println("Phone Pay  is Auto pay");
		return false;
	}

	public String bank() {
		System.out.println("Phone Pay  bank");
		return null;
	}

}
