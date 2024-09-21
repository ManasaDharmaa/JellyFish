class BikeARunner{
	
	public static void main(String [] args){
		
		BikeA.hero("Hero XPulse 200 4V");
		
		System.out.println("the model name of the royalEnfield bike : " + BikeA.royalEnfield("Royal Enfield classic 350"));
		
		System.out.println("the model name of the ktm bike : " + BikeA.ktm(250, "KTM 250 Duke"));
		
		System.out.println("the model name of the suzuki bike : " + BikeA.suzuki(1050, 125, 250));
		
	    System.out.println("the model name of the jawa bike : " + BikeA.jawa("Jawa 42", "Jawa 42 Bobber", "Jawa Perak", "Jawa 350"));
		
	    System.out.println("the model name of the jupite bike : " + BikeA.jupite("Jupiter ZX SmartXonnect", "Europa", "Ganymede", "Ganymede", "Jupiter Sheet Metal Wheel"));
	
	    System.out.println("the model name of the tvs bike : " + BikeA.tvs("TVS Apache", "TVS Radeon", "TVS XL", "Apache rtr 160", "Scooter", "Scooty"));
		
	    System.out.println("the model name of the bajaj bike : " + BikeA.bajaj("Pulsar bike", "Avenger 160", "NS 200", "CT 100", "Dominar 400", "pulsar 150", "pulsar 125"));
		
	}
	
	
	
}