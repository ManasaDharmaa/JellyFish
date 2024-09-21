class Jewellery{
	
	static String typeName; 
	static int  price; 
	static double grossWeight; 
	static float metalWeight; 
	static char purity; 
	static long customerCare; 
	static boolean isJewelleryPresent; 
	
	
	public static void setJewelleryType(String jewelleryTypeName){	
		typeName = jewelleryTypeName;
	} 
	
	public static void setPrice(int jewelleryPrice){
		price = jewelleryPrice;
	}
	
	public static void setGrossWeigth(double jewelleryGrossWeigth){
		grossWeight = jewelleryGrossWeigth;
	}
	
	public static void setMetalWeight(float jewelleryMetalWeight){
		metalWeight = jewelleryMetalWeight;
	}
	
	public static void setPurity(char jewelleryPurity){
		purity = jewelleryPurity;
	}
	
	public static void setCustomerCare(long jewelleryCustomerCare){
		customerCare = jewelleryCustomerCare;
	}
	
	public static void setIsJewelleryPresent(boolean present){
		isJewelleryPresent = present;
	}
	
	
	public static String getJewelleryType(){
		return typeName;
	}
	
	public static int getPrice(){
		return price;
	}
	
	public static double getGrossWeigth(){
		return grossWeight;
	}
	
	public static float getMetalWeight(){
		return metalWeight;
	}
	
	public static char getPurity(){
		return purity;
	}
	
	public static long getCustomerCare(){
		return customerCare;
	}
	
	public static boolean isJewelleryPresent(){
		return isJewelleryPresent;
	}


}