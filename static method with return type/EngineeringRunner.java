class EngineeringRunner{
	
	public static void main(String [] args){
		
		
		
		Engineering.chemical('C');
		
		System.out.println("the aircraft  : " + Engineering.aerospace ("Provides skills and knowledge to design, manufacture, and maintain spacecraft, aircraft, missiles, and weapons systems.") );
		
		
		System.out.println("total students of mechanical  : " + Engineering.mechanical(150, 50));
		
		
		System.out.println("computer Science : " + Engineering.computerScience (170, "Chandrika", 30));
		
		
		System.out.println("Electronics And Communication : " + Engineering.electronicsAndCommunication(30, 90, 120, 20) );
		
		
		System.out.println("Electrical And Electronics engineering : " + Engineering.electricalAndElectronics(25, 25, 50, 10, "Shekar") );
		
		
		System.out.println("civil engineering : " + Engineering.civil(30, 80, 110, 8,5, "Sneha") );
		
		
		System.out.println("industrial engineering : " + Engineering.industrial(10, 0, 10, 5, 2, 7, "Ravi") );
		
		
		System.out.println(" Information science and engineering: " + Engineering.informationScience(30, 70, 100, 10,15, 30, "Anand", "Nandita") );
	}




}