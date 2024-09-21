class AadharRunner{
	
	public static void main(String[] args){
		
		Aadhar aadhar = new Aadhar();
		
		aadhar.keyPepole = "Neelkanth Mishra, Chairman, UIDAI; Amit Agarwal, IAS, CEO, UIDAI";
		String keyPepole = aadhar.keyPepole;
		System.out.println("key pepole of the aadhar card : " + keyPepole);
		
		
		aadhar.launched = 2009;
		int launched = aadhar.launched;
		System.out.println("the launched year : " + launched);
		
		
		aadhar.pinCode = 673310;
		long pinCode = aadhar.pinCode;
		System.out.println("pin Code : " + pinCode);
		
		aadhar.howManyYearPassed = 14;
		short howManyYearPassed = aadhar.howManyYearPassed;
		System.out.println("launched of years : " + howManyYearPassed);
		
		
		aadhar.digitsOfTheCardNo = 12;
		byte digitsOfTheCardNo = aadhar.digitsOfTheCardNo;
		System.out.println("digits Of The CardNo" + digitsOfTheCardNo);
		
		
		aadhar.programme = 'G';
		char programme = aadhar.programme;
		System.out.println("programme : " + programme);
		
		
		aadhar.isOnlineApplicationPresent = true;
		boolean present = aadhar.isOnlineApplicationPresent;
		System.out.println("online Application is Present : " + present);
		
		
		aadhar.budget = 113.66d;
		double budget = aadhar.budget;
		System.out.println("budget : " + budget);
		
		aadhar.status = 137.9f;
		float status = aadhar.status;
		System.out.println("status : " + status);
	}



}