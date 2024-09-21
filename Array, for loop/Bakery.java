class Bakery{
	
	public static void main(String[] args){
		
		
		double plainCake = 15.30d;
		double eggRoll = 30.0d;
		double chocolateBun = 20.0d;
		double redVelvet = 80.0d;
		double puff = 15.0d;
		
		
		double [] items = {plainCake, eggRoll, chocolateBun, redVelvet, puff};
		System.out.println("total length of the double : " + items.length);
		
		items[3] = 60.0d;
		
		for(int i=0; i<=4; i++){
			System.out.println("the cost of the items : " + items[i]);
		}
 
    }
}