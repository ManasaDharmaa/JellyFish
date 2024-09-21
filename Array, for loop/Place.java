class Place{
	
	public static void main(String [] args){
		
		String karnataka = "Bangalure";
		String rajastan = "jaipur";
		String jammuAndKashmira = "shree nagar";
		String andrapradesh = "hyderabad";
		String maharashtra = "mumbai";
		
		
		
		String[] capital = {karnataka, rajastan, jammuAndKashmira, andrapradesh, maharashtra};
		System.out.println("the length of the String : " + capital.length);
		
		capital[2] = "jammu";
		
		for(int i=0; i<capital.length; i++){
			System.out.println(capital[i]);
		}
		
		
	}
}