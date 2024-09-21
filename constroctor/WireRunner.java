class WireRunner{
	
	public static void main(String [] args){
		
		Wire wire = new Wire("Jelectricals", 4, 8967548765l,299.0d,0.0f, 'M', true);
		
		
		System.out.println("wire brand : " + wire.getBrand());
		System.out.println("meter  : " + wire.getMeter());
		System.out.println("customer care of the shop : " +wire.getCustomerCare());
		System.out.println("price : " +wire.getPrice());
		System.out.println("deliver price : " + wire.getDeliverPrice());
		System.out.println("color : " + wire.getColor());
		System.out.println("is present : " + wire.isPresent());
		
	}
	
}