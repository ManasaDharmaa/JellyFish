class JavaRunner{
	
	public static void main(String[] args){
		
		Java java = new Java();
		
		java.javaDetails("James Gosling", 1995, 8, 4.0d, true,'J');
		
		System.out.println(java.inventedBy("James Gosling"));
		System.out.println(java.lunched(1995));
		System.out.println(java.features(8));
		System.out.println(java.pillars(4.0d));
		System.out.println(java.isJDKPresent(true));
		System.out.println(java.firstLetter('J'));
		
	}



}