class MusicRunner{
	
	public static void main(String[] arng){
		
		Music music = new Music();
		
		music.nameOfTheInstruments = "Saxophone";
		String instrumentName = music.nameOfTheInstruments;
		System.out.println("name of the instrument : " + instrumentName);
		
		
		music.bell = 2;
		int bell = music.bell;
		System.out.println("the peaces of bell : " + bell);
		
		
		music.customerCare = 8990562391l;
		long customerCare = music.customerCare;
		System.out.println("customer Care : " + customerCare);
		
		music.neck = 280;
		short neck = music.neck;
		System.out.println("neck : " + neck);
		
		
		music.mouthPiece = 4;
		byte mouthPiece = music.mouthPiece;
		System.out.println("mouth Piece : " + mouthPiece);
		
		
		music.brand = 'Y';
		char brand = music.brand;
		System.out.println("brand name : " + brand);
		
		
		music.isOnlineDeliveryPresent = true;
		boolean present = music.isOnlineDeliveryPresent;
		System.out.println("online delivery is availabel : " + present);
		
		
		music.price = 154000.00d;
		double price = music.price;
		System.out.println("price : " + price);
		
		music.discount = 8990.0f;
		float discount = music.discount;
		System.out.println("Discount : " + discount);
	}
}