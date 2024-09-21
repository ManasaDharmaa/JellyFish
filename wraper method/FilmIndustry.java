class FilmIndustry{
	
	static String hollywood = "USA";
	static Integer totalHero = 16350;
	static Boolean isStootingInUsa = true;
	static Long totalHeroin = 9867l;
	static Character movieName = 'U';
	static Double largestFilmIndustry = 20.0d;
	static Float totalMovies = 16350.0f;
	
	public static void setHollywood(String hollyWood){
		hollywood = hollyWood;
	}
	public static void setTotalHero(Integer totalHeros){
		totalHero = totalHeros;
	}
	public static void setIsStootingInUsa(Boolean isStootingInUSA){
		isStootingInUsa = isStootingInUSA;
	}
	public static void setTotalHeroin(Long totalHeroins){
		totalHeroin = totalHeroins;
	}
	public static void setMovieName(Character movieNames){
		movieName = movieNames;
	}
	public static void setLargestFilmIndustry(Double largestFilmIndustrys){
		largestFilmIndustry = largestFilmIndustrys;
	}
    public static void setTotalMovies(Float totalMovie){
		totalMovies = totalMovie;
	}

	
	
	public static String getHollywood(){
		return hollywood;
	}
	public static Integer getTotalHero(){
		return totalHero;
	}
	public static Boolean isStootingInUsa(){
		return isStootingInUsa;
	}
	public static Long getTotalHeroin(){
		return totalHeroin;
	}
	public static Character getMovieName(){
		return movieName;
	}
	public static Double getLargestFilmIndustry (){
		return largestFilmIndustry;
	}
	public static Float getTotalMovies(){
		return totalMovies;
	}

}