class Interior{
	
	
	public static boolean kitchen(int madular){
		
		if(madular == 536199){
			return true;
		} else {
			return false;
		}
	}
	
	public static int woodDesign(String tree){
		
		if(tree == "Oak"){
			return 15000;
		} else {
			return 1700;
		}
	}
	
	public static String layOuts(char shape){
		
		if(shape == 'L'){
			return "Island";
		} else {
			return "Parallel";
		}
	}
}