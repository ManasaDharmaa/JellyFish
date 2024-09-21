class TV{
	
	
	public static void cost(int tvCost){
		System.out.println("this is static method 1 start");
		TV tv = new TV();
		tv.price(10000);
		System.out.println("this is static method 1 end");
	}
	
	public void price(int tvPrice){
		System.out.println("this is instance method start");
		brand("hyundai");
		System.out.println("this is instance method end");
	}
	
	public static void brand(String brandName){
		
		System.out.println("this is static method 2");
	}
	
	
}