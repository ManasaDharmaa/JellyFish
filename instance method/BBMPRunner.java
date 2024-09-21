class BBMPRunner{
	
	public static void main(String[] args){
		
		BBMP bbmp = new BBMP();
		
		bbmp.bbmpDetails("zoning and building regulations", 560002, 8022660000l, true, 2400.0d);
		
		System.out.println(bbmp.aspects("zoning and building regulations"));
		System.out.println(bbmp.pin(560002));
		System.out.println(bbmp.phNum(8022660000l));
		System.out.println(bbmp.isOpen(false));
		System.out.println(bbmp.buildingSQ(2400.0d));
		
	}



}