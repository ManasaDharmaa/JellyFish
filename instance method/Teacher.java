class Teacher{
	
	String name;
	int salary;
	long phNumber;
	char standard;
	boolean isInPresent;
	double incentive;
	float clsStartedTim;
	
	
	public void teacherDetails(String teacherName, int teacherSalary, long teacherPhNumber, char teacherStandard, boolean present, double teacherIncentive, float teacherClsStartedTim){
		
		System.out.println("teacher Name : "+ teacherName + ". teacher Salary : " + teacherSalary + ". teacher Phone Number : " + teacherPhNumber + ". teacher Standard : " + teacherStandard + ". present : "+present+ ". teacher Incentive : "+ teacherIncentive + ". teacher Cls Started Time : "+ teacherClsStartedTim);
	}
	public String tcrName(String teacherName){
		name = teacherName;
		return name;
	}
	public int tcrSalary(int teacherSalary){
		salary = teacherSalary;
		return salary;
	}
	public long tcrPhNumber(long teacherPhNumber){
		phNumber = teacherPhNumber;
		return phNumber;
	}
	public char tcrStandard(char teacherStandard){
		standard = teacherStandard;
		return standard;
	}
	public boolean isInPresent(boolean present){
		isInPresent = present;
		return isInPresent;
	}
	public double tcrIncentive(double teacherIncentive){
		incentive = teacherIncentive;
		return incentive;
	}
	public float tcrClsStartedTim(float teacherClsStartedTim){
		clsStartedTim = teacherClsStartedTim;
		return clsStartedTim;
	}
	
	
	
	
}