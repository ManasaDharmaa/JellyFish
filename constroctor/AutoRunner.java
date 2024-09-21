class AutoRunner{
	
	public static void main(String [] args){
		
		Auto auto = new Auto("Iron", 3, 8967548765l,1599978.0d,0.0f, 'Y', false);
		
		
		System.out.println("meterial : " + auto.getMaterial());
		System.out.println("wheel : " + auto.getWheel());
		System.out.println("customer care : " +auto.getCustomerCare());
		System.out.println("price : " +auto.getPrice());
		System.out.println("deliver price : " + auto.getDeliverPrice());
		System.out.println("color : " + auto.getColor());
		System.out.println("is returnable : " + auto.isReturnable());
		
		
	}

}