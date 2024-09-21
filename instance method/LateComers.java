class LateComers{
	
	String where;
	int minOfLate;
	long totalSubject;
	boolean iscomming;
	double commingTime;
	float leveingTime;
	
	public void lateComersDetails(String whereIsLate, int minitOfLate, long totalSub, boolean coming, double comingTim, float leveingTim){
		System.out.println(whereIsLate  +" "+ minitOfLate +" "+ totalSub +" "+  coming + " " + comingTim + " "+  leveingTim);
	}
	
	public String where(String whereIsLate){
		where = whereIsLate;
		return where;
	}
	public int minOfLate(int minitOfLate){
		minOfLate = minitOfLate;
		return minOfLate;
	}
	public long totalSubject(long totalSub){
	    totalSubject = 	totalSub;
		return totalSubject;
	}
	public boolean iscomming(boolean coming){
		iscomming = coming;
		return iscomming;
	}
	public double commingTime (double comingTim){
		commingTime = comingTim;
		return commingTime;
	}
	public float leveingTime(float leveingTim){
		leveingTime = leveingTim;
		return leveingTime;
	}
	
}