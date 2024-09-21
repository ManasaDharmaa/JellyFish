class Bank{

   public static void main (String [] args){
	   
	  String branch = "Hassan";
	  String bankName = "canara Bank";
	  int phoneNumber =0;
	  
	  if(branch == "Hassan" && bankName == "SBI"){
		  phoneNumber =82279251;
	  }
	  if(branch == "Hassan" && bankName == "Bank of Baroda"){
		  phoneNumber =18005700;
	  }
	  if(branch == "Hassan" && bankName == "canara Bank"){
		  phoneNumber =265436;
	  }
	  if(branch == "bangalore" && bankName == "canara Bank"){
		  phoneNumber =18001030;
	  }
	  if(branch == "bangalore" && bankName == "SBI"){
		  phoneNumber =1800112211;
	  }
	  if(branch == "bangalore" && bankName == "union bank of india"){
		  phoneNumber =18002244;
	  }
	  
	  System.out.println("the contact number of the city branchs of the bank is : " + phoneNumber);
	  
   }
}