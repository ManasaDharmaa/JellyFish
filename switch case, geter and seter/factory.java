class factory{
	
	static String factoryName;
	
	public static void nameOfTheFactory(char firstLetter){
		
		switch(firstLetter){
			
			case 'S':
			factoryName = "Samsung";
			break;
			
			case 'G':
			factoryName = "GE";
			break;
			
			case 'M':
			factoryName = "Mahindra";
			break;
			
			case 'U':
			factoryName = "Unilever";
			break;
			
			case 'A':
			factoryName = "ABB";
			break;
			
			case 'B':
			factoryName = "Bosch";
			break;
			
			case 'J':
			factoryName = "Johnson Controls International PLC";
			break;
			
			case 'N':
			factoryName = "Nestlé Malaysia";
			break;
			
			case 'I':
			factoryName = "IBM";
			break;
			
			case 'P':
			factoryName = "Philips";
			break;
			
			default:
			factoryName = null;
			break;
		}
		
		System.out.println("Factory name : " + factoryName);
	}


}