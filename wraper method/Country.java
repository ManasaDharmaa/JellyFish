class Country{
	
	 String name = "India";
	 Integer state = 28;
	 Boolean isJammuHaveTwoCapital = true;
	 Long capital = 28l;
	 Double territories = 8.0d;
	 Float population = 148710.0f;
	
	public  void setName(String name){
		this.name = name;
	}
	public  void setState(Integer state){
		this.state = state;
	}
	public  void setIsJammuHaveTwoCapital(Boolean isJammuHaveTwoCapital){
		this.isJammuHaveTwoCapital = isJammuHaveTwoCapital;
	}
	public  void setCapital(Long capital){
		this.capital = capital;
	}
	public void setTerritories(Double territories){
		this.territories = territories;
	}
    public  void setPopulation(Float population){
		this.population = population;
	}

	
	
	public  String getName(){
		return name;
	}
	public  Integer getState(){
		return state;
	}
	public  Boolean isJammuHaveTwoCapital(){
		return isJammuHaveTwoCapital;
	}
	public  Long getCapital(){
		return capital;
	}
	public  Double getTerritories (){
		return territories;
	}
	public  Float getPopulation(){
		return population;
	}
	
	
	
}