class NailPolishRunner{
	
	public static void main(String [] args){
		
		NailPolish nailPolish = new NailPolish("Renee", 4, 8967548765l,15999.0d,0.0f, 'P', true);
		
		
		System.out.println("brand name of nailPolish : " + nailPolish.getBrand());
		System.out.println("set of box  : " + nailPolish.getSetOfbox());
		System.out.println("customer care of the shop : " +nailPolish.getCustomerCare());
		System.out.println("price of the nail Polish : " +nailPolish.getPrice());
		System.out.println("deliver price : " + nailPolish.getDeliverPrice());
		System.out.println("color of thr nail Polish : " + nailPolish.getColor());
		System.out.println("is present : " + nailPolish.isPresent());
		
	}
	
}