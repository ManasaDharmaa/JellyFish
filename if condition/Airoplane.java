class Airoplane{
	
	public static void main(String[] args){
		String airportName = "Kempegowda International Airport Bengaluru";
		int cost =0;
		
		if(airportName == "Rajiv Gandhi International Airport Hyderabad" ){
			cost = 2565;
		}
		
		if(airportName == "Chhatrapati Shivaji International Airport Mumbai"){
			cost  = 3087;
		}
		if(airportName == "Dr Babasaheb Ambedkar International Airport Nagpur"){
			cost = 3813;
		}
		if(airportName == "Bikaner Domestic Airport Rajasthan"){
			cost =5707;
		}
		if(airportName == "Kempegowda International Airport Bengaluru"){
			cost =1268;
		}
		if(airportName == " Indira Gandhi International Airport Delhi"){
			cost = 5913;
		}
		
		System.out.println("The flights ticket price is : " + cost);
	}
}