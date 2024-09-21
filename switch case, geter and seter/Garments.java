class Garments{
	
	static String nameOfTheGarments;
	
	public static void shopNumber(int shopNum){
		
		switch(shopNum){
			
			case 1: 
			nameOfTheGarments = "attire";
			break;
			
			case 2: 
			nameOfTheGarments = "apparel";
			break;
			
			case 3: 
			nameOfTheGarments = "garb";
			break;
			
			case 4: 
			nameOfTheGarments = "dress";
			break;
			
			case 5: 
			nameOfTheGarments = "costume";
			break;
			
			case 6: 
			nameOfTheGarments = "suits";
			break;
			
			case 7: 
			nameOfTheGarments = "Sweaters";
			break;
			
			case 8: 
			nameOfTheGarments = "Jackets";
			break;
			
			case 9: 
			nameOfTheGarments = "Shirts";
			break;
			
			case 10: 
			nameOfTheGarments = "hoodies";
			break;
			
			default :
			nameOfTheGarments = null;
			break;
		}
		
		System.out.println("name of the garments is : " + nameOfTheGarments);
	}
}