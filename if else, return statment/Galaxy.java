class Galaxy{
	
	public static void main(String [] args){
		
		String name = "Samsung Galaxy A55";
		byte gigaByte = 5;
        int cost = 0;


        if(name == "Samsung Galaxy ZFlip6"  && gigaByte == 5){
			cost= 109999;
		} else{
			cost = 0;
		}
            System.out.println("The cost of the mobile : " + cost);
			
		if(name == "Samsung Galaxy Z Fold6" && gigaByte == 5){
			cost =176999;
		} else {
			cost = 0;
		}  
			System.out.println("The cost of the mobile : " + cost);
		
		if(name == "Samsung Galaxy A35" && gigaByte == 5){
			cost = 30999;
		} else{
			cost = 0;
		} 
		    System.out.println("The cost of the mobile : " + cost);
		
        if(name == "Samsung Galaxy A55" && gigaByte == 5){
			cost = 42999;
		} else{
			cost = 0;
		}  
		    System.out.println("The cost of the mobile : " + cost);
			
		if (name == "Samsung Galaxy Z" && gigaByte == 5){
			cost = 164999;
		}else {
			cost = 0;
		}
		System.out.println("The cost of the mobile : " + cost);
			
	}
}