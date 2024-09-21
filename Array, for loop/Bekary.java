class Bekary{
	
	public static void main(String[] args){
		
		
		double plainCake = 15.30;
		double eggRoll = 30.0;
		double chocolateBun = 20.0;
		double redVelvet = 80.0;
		double puff = 15.0;
		
		
		double [] items = {plainCake, eggRoll, chocolateBun, redVelvet, puff};
		System.out.println("total length of the double : " + items.length);
		
		for(int i=0; i<=4; i++){
			System.out.println("the cost of the items : " + items[i]);
		}
 
    }
}