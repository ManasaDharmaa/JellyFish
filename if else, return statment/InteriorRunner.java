class InteriorRunner{
	
	
	public  static void main(String[] args){
		
		boolean kitchenStyle = Interior.kitchen(24991);
		System.out.println("kitchen design cost : " + kitchenStyle);
		
		
		int tree = Interior.woodDesign("Oak");
		System.out.println("type of tree : " + tree);
		
		
		String madularKichen = Interior.layOuts('U');
		System.out.println("shape of the kitchen : " + madularKichen);
		
	}
}