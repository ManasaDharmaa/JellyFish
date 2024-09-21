class Watch{
	
	static String brandName; 
	static int hsnCode;
	static float price; 
	static double strapWidth; 
	static char caseColor; 
	static long upc; 
	static boolean isWatchPresent;
	
	
	public static void setBrandName(String watchBrandName){
		brandName = watchBrandName;
	}
	
	public static void setHSNCode(int watchHSNCode){
		hsnCode = watchHSNCode;
	}
	
	public static void setPrice(float watchPrice){
		price = watchPrice;
	}
	
	public static void setStrapWidth(double watchStrapWidth){
		strapWidth = watchStrapWidth;
	}
	
	public static void setCaseColor(char watchCaseColor){
		caseColor = watchCaseColor;
	}
	
	public static void setUPC(long watchUPC){
		upc = watchUPC;
	}
	
	public static void setIsWatchPresent(boolean present){
		isWatchPresent = present;
	}
	
	public static String getBrandName(){
		return brandName;
	}
	
	public static int getHSNCode(){
		return hsnCode;
	}
	
	public static float getPrice(){
		return price;
	}
	
	public static double getStrapWidth(){
		return strapWidth;
	}
	
	public static char getCaseColor(){
		return caseColor;
	}
	
	public static long getUPC(){
		return upc;
	}
	public static boolean isWatchPresent(){
		return isWatchPresent;
	}
	
}