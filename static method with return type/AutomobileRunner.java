class AutomobileRunner{
	
	
	public static void main(String[] args){
		
		
		Automobile.engine("a positive displacement internal combustion engine, having an intake, compression, combustion and exhaust stroke.");
		
		
		System.out.println("price of the axle: " + Automobile.axle(1993.00));
		
		System.out.println("price of the brake : " + Automobile.brake(4000, 2000));
		
		System.out.println("price of the fuel Tank : " + Automobile.fuelTank("integral", " Ford F-150 pickup truck", "CNG"));
		
		System.out.println("price of the battery : " + Automobile.battery("Ola Roadster", "Piaggio Ape Xtra LDX", "BYD Seal", 150000));
	}
}