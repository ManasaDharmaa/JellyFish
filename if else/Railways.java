class Railways{
	
	
	static int stationNo;
	
	public static void metro(int ticketPrice){
		
		String place = "Banglore";
		
		if((ticketPrice == 70  ||  place == "Hassan")  && (ticketPrice != 110 || place == "Banglore" )){
			
			System.out.println("it is if condition");
		} else{
			
			System.out.println("it is else condition");
		}
	}
}
	
