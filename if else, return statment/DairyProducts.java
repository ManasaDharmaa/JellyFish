class DairyProducts{
	
	public static int milk(String brandName, char packetColor){
		
		if(brandName == "Nandini"  && packetColor == 'B'){
			return 25;
		} else {
			return 30;
		}
	} 
	
	public static String butter(String madeIn, int cost){
		
		if (madeIn == "Milk" && cost ==54){
			return "Milky Mist";
		} else {
			return "Amul";
		}
	}
	
	public static double cheese(String brandName, double cost){
		
		if(brandName == "Amul" && cost == 250.80){
			return 400.0d;
		} else {
			return 500.0d;
		}
	}
	
	public static float yogurt(String flavor, String brandName){
		
		if(flavor == "Strawberry" && brandName == "Epigamia"){
			return 60.00f;
		} else {
			return 25.00f;
		}
		
	}
	
	
	public static  boolean iceCream(String brandName, String flavor){
		
		if (brandName == "kwality walls" || flavor == "Vanilla"){
			return true;
		} else {
			return false;
		}
	}
	
	public static char cream(String brandName, int quantity){
		
		
		if (brandName == "Nestle"  || quantity == 100){
			return 'B';
		} else {
			return 'R';
		}
	}
	
	public static int custard(String brandName, String flavor, int costForBlinkit, int costForBigBasket ){
		
		if(brandName == "Mother Dairy" || flavor == "Vanilla"){
			return costForBlinkit;
		} else {
			return costForBigBasket;
		}
	}
	
	public static String butterMilk(int miliLetter, String flavor, String brandName, String brndName){
		
		if (miliLetter == 200 || flavor == "Masala"){
			return brandName;
		} else {
			return brndName;
		}
	}
	
	
	
 	
}