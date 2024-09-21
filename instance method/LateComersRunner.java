class LateComersRunner{
	
	public static void main(String [] args){
		
		LateComers lateComers = new LateComers();
		
		lateComers.lateComersDetails("class", 30, 3, true, 6.30d, 8.30f);
		
		System.out.println(lateComers.where("class"));
		System.out.println(lateComers.minOfLate(30));
		System.out.println(lateComers.totalSubject(3));
		System.out.println(lateComers.iscomming(false));
		System.out.println(lateComers.commingTime(7.30d));
		System.out.println(lateComers.leveingTime(9.30f));
		
		
	}



}