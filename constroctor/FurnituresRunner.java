class FurnituresRunner{
	
	public static void main(String [] args){
		
		Furnitures furnitures = new Furnitures("Sofa", 4, 8967548765l,15999.0d,0.0f, 'G', true);
		
		
		System.out.println("name of thr Furniture : " + furnitures.getName());
		System.out.println("seater of the sofa : " + furnitures.getSeater());
		System.out.println("customer care of the shop : " +furnitures.getCustomerCare());
		System.out.println("price of the sofa : " +furnitures.getPrice());
		System.out.println("deliver price : " + furnitures.getDeliverPrice());
		System.out.println("color of thr Furniture : " + furnitures.getColor());
		System.out.println("is that four seater : " + furnitures.isFourSeater());
		
	}
}