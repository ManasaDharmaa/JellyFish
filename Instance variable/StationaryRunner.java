class StationaryRunner{
	
	
	public static void main(String [] args){
		
		Stationary stationary  = new Stationary();
		stationary.nameOfTheItem = "Case Bound Note Book";
		String name = stationary.nameOfTheItem;
		System.out.println("name of the item : "+name);
		
		
		stationary.sellingPrice = 120;
		int price = stationary.sellingPrice;
		System.out.println("selling Price : " +price);
		
		
		stationary.barCode = 8902442233072l;
		long bCode = stationary.barCode;
		System.out.println("bar code : " +bCode);
		
		
		stationary.pages = 115;
		byte page = stationary.pages;
		System.out.println("number of the pages : "+page);
		
		
		stationary.quantity = 1;
		short qnty = stationary.quantity;
		System.out.println("quantity : " +qnty);
		
		
		stationary.size ='S';
		char siz = stationary.size;
		System.out.println("size of the note book : "+ siz);
		
		
		stationary.isBookPresent = true;
		boolean present =stationary.isBookPresent;
		System.out.println("note book present in stationary : " +present);
		
		
		stationary.mrpPrice = 150.0d;
		double mrp = stationary.mrpPrice;
		System.out.println("mrp price of the note book : " +mrp);
		
		stationary.uniqueSellingPoint = 0.63f;
		float usp = stationary.uniqueSellingPoint;
		System.out.println("cost per page : "+usp);
	}




}