class NosePinRunner{
	
	public static void main(String[] args){
		
		NosePin nosePin = new NosePin();
		
		nosePin.name = "Smita Diamond Nose Pin";
		String name = nosePin.name;
		System.out.println("name of the nosePin : " + name);
		
		
		nosePin.numOfStone = 3;
		int numOfStone = nosePin.numOfStone;
		System.out.println("number Of Stone : " + numOfStone);
		
		
		nosePin.price = 13302;
		long price = nosePin.price;
		System.out.println("price of nosePin : " + price);
		
		nosePin.rating = 5;
		short rating = nosePin.rating;
		System.out.println("rating : " + rating);
		
		
		nosePin.purity = 18;
		byte purity = nosePin.purity;
		System.out.println("purity" + purity);
		
		
		nosePin.color = 'G';
		char color = nosePin.color;
		System.out.println("color of nosePin : " + color);
		
		
		nosePin.isOnlineDeliveryPresent = true;
		boolean present = nosePin.isOnlineDeliveryPresent;
		System.out.println("online delivery is Present : " + present);
		
		
		nosePin.weight = 0.252d;
		double weight = nosePin.weight;
		System.out.println("weight : " + weight);
		
		nosePin.height = 3.38f;
		float height = nosePin.height;
		System.out.println("height : " + height);
	}
}