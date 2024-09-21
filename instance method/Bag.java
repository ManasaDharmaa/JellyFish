class Bag{
	
	String brandName;
	int noCompartment;
	long customerCare;
	char size;
	boolean isOnlieDeliveryPresent;
	double price;
	float rating;
	
	public void bagDetails(String nameOfTheBrand, int bagCompartment, long custmrCare, char bagSize, boolean present, double bagPrice, float bagRating){
		System.out.println("Name of the bag brand : " + nameOfTheBrand + ". bag compartment : " + bagCompartment+ ". custmr Care" + custmrCare + ". bag size" + bagSize+ ". online delivery is present : " + present+ ". bag price : " + bagPrice+ ". bag rating : " + bagRating);
	}
	
	public String brndName(String nameOfTheBrand){
		brandName = nameOfTheBrand;
		return brandName;
	}
	public int compartmentNo(int bagCompartment){
		noCompartment = bagCompartment;
		return noCompartment;
	}
	public long brandCustomerCare(long custmrCare){
	    customerCare = 	custmrCare;
		return customerCare;
	}
	public char siz(char bagSize){
		size = bagSize;
		return size;
	}
	public boolean bagisOnlieDeliveryPresent(boolean present){
		isOnlieDeliveryPresent = present;
		return isOnlieDeliveryPresent;
	}
	public double bagPrice (double bagPrice){
		price = bagPrice;
		return price;
	}
	public float rating(float bagRating){
		rating = bagRating;
		return rating;
	}
}