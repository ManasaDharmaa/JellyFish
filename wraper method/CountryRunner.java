class CountryRunner{
	
	public static void main(String [] args){
		
		Country country = new Country();
		
		country.setName("japan");
		country.setState(47);
		country.setIsJammuHaveTwoCapital(false);
		country.setCapital(3l);
		country.setTerritories(3700.0d);
		country.setPopulation(123493.0f);
		
		System.out.println(country.getName());
		System.out.println(country.getState());
		System.out.println(country.isJammuHaveTwoCapital());
		System.out.println(country.getCapital());
		System.out.println(country.getTerritories());
		System.out.println(country.getPopulation());
		
	}
	
	
	
	
}