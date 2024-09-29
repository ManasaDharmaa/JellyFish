package com.xworkz.tv.boot;

public class TV {
	
String brand;
	
	int price;
	
	float version;
	
	char series;
	
	long costomerCare;
	
	String nameOfTheFounder;
	
	String firstTVCompany;
	
	int companyCode;
	
	float firstTVPrice;
	
	long firtsNumber;
	
	String nameOfOwner;
	
	long numberOfOwner;
	
	int houseNumber;
	
	String firstSetOfBox;
	
	int cost;
	
	float lowestCostOfReacharge;
	
	String latestTV;
	
	String secondTV;
	
	String latestTVFounder;
	
	String secondTVFounder;
	
	int latestTVPrice;
	
	float latestTVVersion;
	
	char latestTVSeries;
	
	long latestTVCostomerCare;
	
	String latestTVNameOfTheFounder;
	
	String latestTVCompany;
	
	int latestTVCompanyCode;
	
	float samsungTVPrice;
	
	long samsungfirtsNumber;
	
	String samsungOfOwner;
	
	float hyundaiTVPrice;
	
	long hyundaiFirtsNumber;
	
	String hyundaiOfOwner;
	
	float vivoTVPrice;
	
	long vivofirtsNumber;
	
	
	
	
	public TV(String brand, int price, float version, char series, long costomerCare, String nameOfTheFounder,
			String firstTVCompany, int companyCode, float firstTVPrice, long firtsNumber, String nameOfOwner,
			long numberOfOwner, int houseNumber, String firstSetOfBox, int cost, float lowestCostOfReacharge,
			String latestTV, String secondTV, String latestTVFounder, String secondTVFounder, int latestTVPrice,
			float latestTVVersion, char latestTVSeries, long latestTVCostomerCare, String latestTVNameOfTheFounder,
			String latestTVCompany, int latestTVCompanyCode, float samsungTVPrice, long samsungfirtsNumber,
			String samsungOfOwner, float hyundaiTVPrice, long hyundaiFirtsNumber, String hyundaiOfOwner,
			float vivoTVPrice, long vivofirtsNumber) {
		super();
		this.brand = brand;
		this.price = price;
		this.version = version;
		this.series = series;
		this.costomerCare = costomerCare;
		this.nameOfTheFounder = nameOfTheFounder;
		this.firstTVCompany = firstTVCompany;
		this.companyCode = companyCode;
		this.firstTVPrice = firstTVPrice;
		this.firtsNumber = firtsNumber;
		this.nameOfOwner = nameOfOwner;
		this.numberOfOwner = numberOfOwner;
		this.houseNumber = houseNumber;
		this.firstSetOfBox = firstSetOfBox;
		this.cost = cost;
		this.lowestCostOfReacharge = lowestCostOfReacharge;
		this.latestTV = latestTV;
		this.secondTV = secondTV;
		this.latestTVFounder = latestTVFounder;
		this.secondTVFounder = secondTVFounder;
		this.latestTVPrice = latestTVPrice;
		this.latestTVVersion = latestTVVersion;
		this.latestTVSeries = latestTVSeries;
		this.latestTVCostomerCare = latestTVCostomerCare;
		this.latestTVNameOfTheFounder = latestTVNameOfTheFounder;
		this.latestTVCompany = latestTVCompany;
		this.latestTVCompanyCode = latestTVCompanyCode;
		this.samsungTVPrice = samsungTVPrice;
		this.samsungfirtsNumber = samsungfirtsNumber;
		this.samsungOfOwner = samsungOfOwner;
		this.hyundaiTVPrice = hyundaiTVPrice;
		this.hyundaiFirtsNumber = hyundaiFirtsNumber;
		this.hyundaiOfOwner = hyundaiOfOwner;
		this.vivoTVPrice = vivoTVPrice;
		this.vivofirtsNumber = vivofirtsNumber;
	}

	public String toString() {
		return "Mobile {brand "+brand+ " price "+ price+ " version " + version+ 
				" series " + series + " costomerCare " + costomerCare + "  Founder name " 
				+ nameOfTheFounder + " firstTVCompany " + firstTVCompany + 
				" firstTVPrice " +firstTVPrice + " firtsNumber " + firtsNumber + 
				" nameOfOwner " + nameOfOwner + " numberOfOwner " + numberOfOwner +
				" houseNumber " + houseNumber + " firstSetOfBox " + firstSetOfBox   + " cost " 
				+ cost + " lowestCostOfReacharge " + lowestCostOfReacharge + " latestTV " 
				+ latestTV + " secondTV " + secondTV + " latestTVFounder "
				+ latestTVFounder + " latestTVFounder "+  secondTVFounder + 
				" latestTVFounder " + latestTVPrice + " latestTVVersion " 
				+ latestTVVersion + " latestTVVersion " + latestTVSeries + 
				" latestTVCostomerCare " + latestTVCostomerCare + " samsungTVPrice " 
				+ samsungTVPrice + " samsungfirtsNumber "+ samsungfirtsNumber + 
				" samsungOfOwner "+ samsungOfOwner +  " hyundaiTVPrice " + hyundaiTVPrice + 
				" hyundaiFirtsNumber "+ hyundaiFirtsNumber + " hyundaiOfOwner " + hyundaiOfOwner + 
				" vivoTVPrice "+ vivoTVPrice + " vivofirtsNumber " + vivofirtsNumber + "}"  ;
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
		
		result = prime + result * firstTVCompany.hashCode();
		
		result = prime + result * companyCode;
		
		result = prime + result * (int)firstTVPrice;
		
		result = prime + result * (int)firtsNumber;
		
		result = prime + result * nameOfOwner.hashCode();
		
		result = prime + result * (int)numberOfOwner;
		
		result = prime + result * houseNumber;
		
		result = prime + result * firstSetOfBox.hashCode();
		
		result = prime + result * cost;
		
		result = prime + result * (int)lowestCostOfReacharge;
		
		result = prime + result * latestTV.hashCode();
		
        result = prime + result * secondTV.hashCode();
		
		result = prime + result * latestTVFounder.hashCode();
		
		result = prime + result * secondTVFounder.hashCode();
		
		result = prime + result * latestTVPrice;
		
		result = prime + result * (int)latestTVVersion;
		
		result = prime + result * latestTVSeries;
		
		result = prime + result * (int)latestTVCostomerCare;
		
		result = prime + result * latestTVNameOfTheFounder.hashCode();
		
		result = prime + result * latestTVCompany.hashCode();
		
		result = prime + result * (int)latestTVCompanyCode;
		
		result = prime + result * (int)samsungTVPrice;
		
		result = prime + result * (int)samsungfirtsNumber;
		
		result = prime + result * samsungOfOwner.hashCode();
		
		result = prime + result * (int)hyundaiTVPrice;
		
		result = prime + result * (int)hyundaiFirtsNumber;
		
		result = prime + result * hyundaiOfOwner.hashCode();
		
		result = prime + result * (int)vivoTVPrice;
		
		result = prime + result * (int)vivofirtsNumber;
		
		return result;
	}


}
