package com.xworkz.mobile.boot;

public class Mobile {
	
	String brand;
	
	int price;
	
	float version;
	
	char series;
	
	long costomerCare;
	
	String nameOfTheFounder;
	
	String firstMobileCompany;
	
	int companyCode;
	
	float firstPhonePrice;
	
	long firtsNumber;
	
	String nameOfOwner;
	
	long numberOfOwner;
	
	int houseNumber;
	
	String firstSim;
	
	int cost;
	
	float lowestCostOfReacharge;
	
	String latestPhone;
	
	String secondPhone;
	
	String latestPhoneFounder;
	
	String secondPhoneFounder;
	
	int latestPhonePrice;
	
	float latestPhoneVersion;
	
	char latestPhoneSeries;
	
	long latestPhoneCostomerCare;
	
	String latestPhoneNameOfTheFounder;
	
	String latestPhoneCompany;
	
	int latestPhoneCompanyCode;
	
	float samsungPhonePrice;
	
	long samsungfirtsNumber;
	
	String samsungOfOwner;
	
	float oppoPhonePrice;
	
	long oppofirtsNumber;
	
	String oppoOfOwner;
	
	float vivoPhonePrice;
	
	long vivofirtsNumber;
	
	String vivoFounder;
	
	
	public Mobile(String brand, int price, float version, char series, long costomerCare, String nameOfTheFounder,
			String firstMobileCompany, int companyCode, float firstPhonePrice, long firtsNumber, String nameOfOwner,
			long numberOfOwner, int houseNumber, String firstSim, String simFounder, int cost,
			float lowestCostOfReacharge, String latestPhone, String secondPhone, String latestPhoneFounder,
			String secondPhoneFounder, int latestPhonePrice, float latestPhoneVersion, char latestPhoneSeries,
			long latestPhoneCostomerCare, String latestPhoneNameOfTheFounder, String latestPhoneCompany,
			int latestPhoneCompanyCode, float samsungPhonePrice, long samsungfirtsNumber, String samsungOfOwner,
			float oppoPhonePrice, long oppofirtsNumber, String oppoOfOwner, float vivoPhonePrice,
			long vivofirtsNumber, String vivoFounder) {
		super();
		this.brand = brand;
		this.price = price;
		this.version = version;
		this.series = series;
		this.costomerCare = costomerCare;
		this.nameOfTheFounder = nameOfTheFounder;
		this.firstMobileCompany = firstMobileCompany;
		this.companyCode = companyCode;
		this.firstPhonePrice = firstPhonePrice;
		this.firtsNumber = firtsNumber;
		this.nameOfOwner = nameOfOwner;
		this.numberOfOwner = numberOfOwner;
		this.houseNumber = houseNumber;
		this.firstSim = firstSim;
		this.cost = cost;
		this.lowestCostOfReacharge = lowestCostOfReacharge;
		this.latestPhone = latestPhone;
		this.secondPhone = secondPhone;
		this.latestPhoneFounder = latestPhoneFounder;
		this.secondPhoneFounder = secondPhoneFounder;
		this.latestPhonePrice = latestPhonePrice;
		this.latestPhoneVersion = latestPhoneVersion;
		this.latestPhoneSeries = latestPhoneSeries;
		this.latestPhoneCostomerCare = latestPhoneCostomerCare;
		this.latestPhoneNameOfTheFounder = latestPhoneNameOfTheFounder;
		this.latestPhoneCompany = latestPhoneCompany;
		this.latestPhoneCompanyCode = latestPhoneCompanyCode;
		this.samsungPhonePrice = samsungPhonePrice;
		this.samsungfirtsNumber = samsungfirtsNumber;
		this.samsungOfOwner = samsungOfOwner;
		this.oppoPhonePrice = oppoPhonePrice;
		this.oppofirtsNumber = oppofirtsNumber;
		this.oppoOfOwner = oppoOfOwner;
		this.vivoPhonePrice = vivoPhonePrice;
		this.vivofirtsNumber = vivofirtsNumber;
		this.vivoFounder = vivoFounder;
	}
	
	public String toString() {
		return "Mobile {brand "+brand+ " price "+ price+ " version " + version+ 
				" series " + series + " costomerCare " + costomerCare + "  Founder name " 
				+ nameOfTheFounder + " firstMobileCompany " + firstMobileCompany + 
				" firstPhonePrice " +firstPhonePrice + " firtsNumber " + firtsNumber + 
				" nameOfOwner " + nameOfOwner + " numberOfOwner " + numberOfOwner +
				" houseNumber " + houseNumber + " firstSim " + firstSim   + " cost " 
				+ cost + " lowestCostOfReacharge " + lowestCostOfReacharge + " latestPhone " 
				+ latestPhone + " secondPhone " + secondPhone + " latestPhoneFounder "
				+ latestPhoneFounder + " secondPhoneFounder "+  secondPhoneFounder + 
				" latestPhonePrice " + latestPhonePrice + " latestPhoneVersion " 
				+ latestPhoneVersion + " latestPhoneSeries " + latestPhoneSeries + 
				" latestPhoneCostomerCare " + latestPhoneCostomerCare + " samsungPhonePrice " 
				+ samsungPhonePrice + " samsungfirtsNumber "+ samsungfirtsNumber + 
				" samsungOfOwner "+ samsungOfOwner +  " oppoPhonePrice " + oppoPhonePrice + 
				" oppofirtsNumber "+ oppofirtsNumber + " oppoOfOwner " + oppoOfOwner + 
				" vivoPhonePrice "+ vivoPhonePrice + " vivofirtsNumber " + vivofirtsNumber + "vivo Founder"+ vivoFounder +" }"  ;
	}
	
	public int hashCode() {
		final int prime = 21;
		
		int result = 1;
		
		result = prime + result;
		
		result = prime + result * brand.hashCode();
		
		result = prime + result * price;
		
		result = prime + result * (int)version;
		
		result = prime + result * series;
		
		result = prime + result * (int)costomerCare;
		
		result = prime + result * nameOfTheFounder.hashCode();
		
		result = prime + result * firstMobileCompany.hashCode();
		
		result = prime + result * companyCode;
		
		result = prime + result * (int)firstPhonePrice;
		
		result = prime + result * (int)firtsNumber;
		
		result = prime + result * nameOfOwner.hashCode();
		
		result = prime + result * (int)numberOfOwner;
		
		result = prime + result * houseNumber;
		
		result = prime + result * firstSim.hashCode();
		
		result = prime + result * cost;
		
		result = prime + result * (int)lowestCostOfReacharge;
		
		result = prime + result * latestPhone.hashCode();
		
        result = prime + result * secondPhone.hashCode();
		
		result = prime + result * latestPhoneFounder.hashCode();
		
		result = prime + result * secondPhoneFounder.hashCode();
		
		result = prime + result * latestPhonePrice;
		
		result = prime + result * (int)latestPhoneVersion;
		
		result = prime + result * latestPhoneSeries;
		
		result = prime + result * (int)latestPhoneCostomerCare;
		
		result = prime + result * latestPhoneNameOfTheFounder.hashCode();
		
		result = prime + result * latestPhoneCompany.hashCode();
		
		result = prime + result * (int)latestPhoneCompanyCode;
		
		result = prime + result * (int)samsungPhonePrice;
		
		result = prime + result * (int)samsungfirtsNumber;
		
		result = prime + result * samsungOfOwner.hashCode();
		
		result = prime + result * (int)oppoPhonePrice;
		
		result = prime + result * (int)oppofirtsNumber;
		
		result = prime + result * oppoOfOwner.hashCode();
		
		result = prime + result * (int)vivoPhonePrice;
		
		result = prime + result * (int)vivofirtsNumber;
		
		result = prime + result * vivoFounder.hashCode();		
		return result;
	}

}
