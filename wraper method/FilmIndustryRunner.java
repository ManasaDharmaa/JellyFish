class FilmIndustryRunner{
	
	public static void main(String [] args){
		
		FilmIndustry.setHollywood("Indian");
		FilmIndustry.setTotalHero(67000);
		FilmIndustry.setIsStootingInUsa(false);
		FilmIndustry.setTotalHeroin(9807l);
		FilmIndustry.setMovieName('u');
		FilmIndustry.setLargestFilmIndustry(3456.0d);
		FilmIndustry.setTotalMovies(7632.0f);
		
		System.out.println(FilmIndustry.getHollywood());
		System.out.println(FilmIndustry.getTotalHero());
		System.out.println(FilmIndustry.isStootingInUsa());
		System.out.println(FilmIndustry.getTotalHeroin());
		System.out.println(FilmIndustry.getMovieName());
		System.out.println(FilmIndustry.getLargestFilmIndustry());
		System.out.println(FilmIndustry.getTotalMovies());
		
	}
	
	
}