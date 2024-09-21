class IceCream{
 
 
    public static void main(String [] args){
	  
	    String flavour = "strawberry";
	  
	    int cost = 0;
		
		
		if(flavour ==  "strawberry"){
			cost = 80;
		}
		if(flavour == "chocolate"){
			cost = 200;
		}
		if(flavour == "vanilla"){
			cost = 90;
		}
		if(flavour == "butterscotch"){
			cost = 162;
		}
		if(flavour == "oreo"){
			cost = 60;
		}
		
		System.out.println("The  ice-cream cost is : " + cost);
    }

}