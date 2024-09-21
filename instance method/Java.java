class Java{
	
	
	String inventedBy; //James Gosling
	int lunched; //1995
	long features; //8
	double pillars; //4.0d
	boolean isJDKPresent;
	char firstLetter; 
	
	
	public void javaDetails(String javaInventedBy, int javaLunched, long javaFeatures, double javaPillars, boolean jdkPresent, char javaFirstLetter){
		System.out.println("java is invented By : " +javaInventedBy+  ". java lunched in : "+ javaLunched + ". features of java : " + javaFeatures + ". pillars of java : " + javaPillars + ".  JDK is present : " + jdkPresent + ". java first letter : " + javaFirstLetter);
	}
	
	public String inventedBy(String javaInventedBy){
		inventedBy = javaInventedBy;
		return inventedBy;
	}
	public long features(long javaFeatures){
		features = javaFeatures;
		return features;
	}
	public int lunched(int javaLunched){
		lunched = javaLunched;
		return lunched;
	}
	public double pillars(double javaPillars){
		pillars = javaPillars;
		return pillars;
	}
	public boolean isJDKPresent(boolean present){
		isJDKPresent = present;
		return isJDKPresent;
	}
	public char firstLetter(char javaFirstLetter){
		firstLetter = javaFirstLetter;
		return firstLetter;
	}







}