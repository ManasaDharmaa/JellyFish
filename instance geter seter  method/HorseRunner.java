class HorseRunner{
	
	public static void main(String [] args){
		
		Horse horse = new Horse();
		
		horse.setName("horse");
		horse.setLegs(8);
		horse.setTail(2);
		horse.setFirstLetter('h');
		horse.setPoil(4.0d);
		horse.setHoof(8.0f);
		horse.setIslive(false);
		
		System.out.println(horse.getName());
		System.out.println(horse.getLegs());
		System.out.println(horse.getTail());
		System.out.println(horse.getFirstLetter());
		System.out.println(horse.getPoil());
		System.out.println(horse.getHoof());
		System.out.println(horse.islive());
	}
}