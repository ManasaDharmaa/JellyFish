class Spectacles{
	
	String brandName;
	long customerCare;
	char size;
	boolean isOnlieDeliveryPresent;
	double price;
	float rating;
	
	public void specDetails(String nameOfTheBrand, long custmrCare, char specSize, boolean present, double specPrice, float specRating){
		System.out.println("Name of the spec brand : " + nameOfTheBrand + ". custmr Care" + custmrCare + ". spec size" + specSize+ ". online delivery is present : " + present+ ". spec price : " + specPrice+ ". bag rating : " + specRating);
	}
	
	public String brandName(String nameOfTheBrand){
		brandName = nameOfTheBrand;
		return brandName;
	}
	public long CustomerCare(long custmrCare){
	    customerCare = 	custmrCare;
		return customerCare;
	}
	public char siz(char bagSize){
		size = bagSize;
		return size;
	}
	public boolean isOnlieDeliveryPresent(boolean present){
		isOnlieDeliveryPresent = present;
		return isOnlieDeliveryPresent;
	}
	public double Price (double specPrice){
		price = specPrice;
		return price;
	}
	public float rating(float specRating){
		rating = specRating;
		return rating;
	}
}