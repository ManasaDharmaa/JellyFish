class Refrigerator{
	
	static String  brandName; 
	static int price; 
	static long customerCareNumber; 
	static float emi; 
	static double capacity; 
	static char color; // 'B'
	static boolean isRefrigeratorPresent;
	
	
	public static void setBrandName(String refrigeratorBrandName){
		
		brandName = refrigeratorBrandName;
	}
	
	public static void setPrice(int refrigeratorPrice){
		
		price = refrigeratorPrice;
	}
	
	public static void setCustomerCareNumber(long refrigeratorCustomerCareNumber){
		
		customerCareNumber = refrigeratorCustomerCareNumber;
	}
	
	public static void setEMI(float refrigeratorEMI){
		
		emi = refrigeratorEMI;
	}
	
	public static void setCapacity(double refrigeratorCapacity){
		
		capacity = refrigeratorCapacity;
	}
	
	public static void setColor(char refrigeratorColor){
		
		color = refrigeratorColor;
	}
	
	public static void setIsRefrigeratorPresent(boolean present){
		
		isRefrigeratorPresent = present;
	}
	
	
	public static String getBrandName(){
		
		return brandName;
	}
	
	public static int getPrice(){
		
		return price;
	}
	
	public static long getCustomerCareNumber(){
		
		return customerCareNumber;
	}
	
	public static float getEMI(){
		
		return emi;
	}
	
	public static double getCapacity(){
		
		return capacity;
	}
	
	public static char getColor(){
		
		return color;
	}
	
	public static boolean isRefrigeratorPresent(){
		return isRefrigeratorPresent;
	}

}