class TeacherRunner{
	
	public static void main(String [] args){
		
		Teacher teacher = new Teacher();
		
		teacher.teacherDetails("Asha", 15000, 9807654329l, 'V', true, 2000.0d, 9.30f);
		
		System.out.println("teacher Name : " +teacher.tcrName("Shruthi"));
		System.out.println("teacher Salary : "+teacher.tcrSalary(20000));
		System.out.println("teacher Phone Number : "+teacher.tcrPhNumber(9807652341l));
		System.out.println("teacher Standard : " +teacher.tcrStandard('X'));
		System.out.println("present : "+teacher.isInPresent(false));
		System.out.println("teacher Incentive : "+teacher.tcrIncentive(1000.0d));
		System.out.println("teacher Cls Started Time : "+teacher.tcrClsStartedTim(10.0f));
		
	}
}