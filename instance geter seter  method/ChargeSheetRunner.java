class ChargeSheetRunner{
	
	public static void main(String[] args){
		
		ChargeSheet chargeSheet = new ChargeSheet();
		
		chargeSheet.setMeaning("When a Police officer gives a Police report");
		chargeSheet.setSection(170);
		chargeSheet.setUnderSubSection(3);
		chargeSheet.setCrPC('R');
		chargeSheet.setAct(1983.0d);
		chargeSheet.setCost(400.0f);
		chargeSheet.setIsSubmitted(false);
		
		System.out.println(chargeSheet.getMeaning());
		System.out.println(chargeSheet.getSection());
		System.out.println(chargeSheet.getUnderSubSection());
		System.out.println(chargeSheet.getCrPC());
		System.out.println(chargeSheet.getAct());
		System.out.println(chargeSheet.getCost());
		System.out.println(chargeSheet.isSubmitted());
	}

}