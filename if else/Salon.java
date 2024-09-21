class Salon{
	
	public static void main(String [] args){
		
		String stylist = "hair cut";
		char gender = 'G';
		int cost  = 0;
		
		
		if(stylist == "hair cut"  && gender == 'G'){
			cost= 1700;
		} else {
			cost = 18000;
		}
		    System.out.println("The cost of the Styles : " + cost);
		
		if(stylist == "kids cut" && gender == 'B'){
			cost =850;
		} else {
			cost = 650;
		}
			System.out.println("The cost of the Styles : " + cost);
			
		if(stylist == "beard trim" && gender == 'B'){
			cost = 350;
		} else {
			cost = 300;
		}
		    System.out.println("The cost of the Styles : " + cost);
			
		if(stylist == "hair wash" && gender == 'G'){
			cost = 500;
		} else {
			cost = 600;
		} 
		    System.out.println("The cost of the Styles : " + cost);
	}
}