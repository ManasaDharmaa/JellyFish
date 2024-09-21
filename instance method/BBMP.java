class BBMP{

	String aspects; 
	int pin; 
	long phNum; 
	boolean isOpen;
	double buildingSQ; 
	
	
	public void bbmpDetails(String bbmpAspects, int pinCode, long phNo, boolean open, double sqPt){
		System.out.println("bbmp Aspects : " +bbmpAspects+  ". pin Code : "+ pinCode + ". phone number : " + phNo + ". isOpen : " + open + ". building SQ : " + sqPt);
	}
	
	public String aspects(String bbmpAspects){
		aspects = bbmpAspects;
		return aspects;
	}
	public int pin(int pinCode){
		pin = pinCode;
		return pin;
	}
	public long phNum(long phNo){
		phNum = phNo;
		return phNum;
	}
	public boolean isOpen(boolean open){
		isOpen = open;
		return isOpen;
	}
	public double buildingSQ(double sqPt){
		buildingSQ = sqPt;
		return buildingSQ;
	}
}