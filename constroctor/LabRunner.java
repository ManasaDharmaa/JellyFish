class LabRunner{
	
	public static void main(String [] args){
		
		Lab lab = new Lab("Java", 4, 8967548765l,56999.0d,0.0f, 'W', true);
		
		
		System.out.println("wire brand : " + lab.getName());
		System.out.println("meter  : " + lab.getTotalSub());
		System.out.println("customer care of the shop : " +lab.getSystemNo());
		System.out.println("price : " +lab.getPrice());
		System.out.println("deliver price : " + lab.getDeliverPrice());
		System.out.println("color : " + lab.getColor());
		System.out.println("is present : " + lab.isPresent());
		
	}

}