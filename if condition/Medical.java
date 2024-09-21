class Medical{
	
	
	public static void main(String [] args){
		
		String disease = "fever";
		int age = 22;
		String medicine =null;
		
		if (disease == "cough" && age ==25){
			medicine = "koflet";
		}
		if(disease == "toothache" && age == 6){
			medicine = "orajel";
		}
		if(disease == "fever" && age == 4){
			medicine = "Calpol";
		}
		if(disease == "headache" && age == 22){
			medicine = "excdrin";
		}
		if (disease == "fever" && age == 22){
			medicine = "Dolo 650";
		}
		System.out.println("The medicine for disease dipends on the age is : " +  medicine);
		
		}
}