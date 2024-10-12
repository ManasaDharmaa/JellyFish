package com.xworkz.upiApps.runner;

import com.xworkz.upiApps.boot.CreaditCard;
import com.xworkz.upiApps.boot.GooglePay;
import com.xworkz.upiApps.boot.PhonePay;
import com.xworkz.upiApps.bridge.UPIInterface;

public class UPIRunner {
	
	public static void main(String[] args) {
		
		UPIInterface phonepay = new PhonePay();
		UPIInterface googlepay = new GooglePay();
		
		phonepay.bank();
		phonepay.id();
		phonepay.isAutoPay();
		phonepay.number();
		
		
		googlepay.bank();
		googlepay.id();
		googlepay.isAutoPay();
		googlepay.number();
		
		CreaditCard creaditCard = new CreaditCard();
		
		creaditCard.setInterface(phonepay);
		creaditCard.Interface.bank();
		creaditCard.Interface.id();
		creaditCard.Interface.isAutoPay();
		creaditCard.Interface.number();
		
		creaditCard.setInterface(googlepay);
		creaditCard.Interface.bank();
		creaditCard.Interface.id();
		creaditCard.Interface.isAutoPay();
		creaditCard.Interface.number();
		
	}

}
