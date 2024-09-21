class SweetsRunner{
	
	public static void main(String[] args){
		
		Sweets sweets = new Sweets();
		
		sweets.sweetName = "Chikki";
		String sweetName = sweets.sweetName;
		System.out.println("name of the sweets : " + sweetName);
		
		
		sweets.noOfIngredients = 5;
		int noOfIngredients = sweets.noOfIngredients;
		System.out.println("number Of Ingredients : " + noOfIngredients);
		
		
		sweets.price = 310;
		long price = sweets.price;
		System.out.println("price of 200g : " + price);
		
		sweets.weight = 200;
		short weight = sweets.weight;
		System.out.println("weight of the packet : " + weight);
		
		
		sweets.pieces = 12;
		byte pieces = sweets.pieces;
		System.out.println("pieces of the packet" + pieces);
		
		
		sweets.color = 'B';
		char color = sweets.color;
		System.out.println("color of chikki : " + color);
		
		
		sweets.isOnlineDeliveryPresent = true;
		boolean present = sweets.isOnlineDeliveryPresent;
		System.out.println("online delivery is Present : " + present);
		
		
		sweets.rating = 4.2d;
		double rating = sweets.rating;
		System.out.println("rating : " + rating);
		
		sweets.deliveryCharges = 90.0f;
		float deliveryCharges = sweets.deliveryCharges;
		System.out.println("delivery Charges : " + deliveryCharges);
	}





}