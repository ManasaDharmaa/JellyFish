class DmartRunner{
	
	public static void main(String [] args){
		
		Dmart.quality("Good");
		
		System.out.println("owner of the Dmart  : " + Dmart.owner("Radhakishan Damani"));
		
		System.out.println("income of the D mart  : " + Dmart.income(170000, 2140000));
		
		System.out.println("brands or categories  : " + Dmart.brands("grocery and staplles", "daily Essentials", "dairy And Frozen"));
	}
}