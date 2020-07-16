package com.example.model;

public class MovieInfo {
	private String movieName;
	public MovieInfo(String movieName, int movieId) {
		super();
		this.movieName = movieName;
		this.movieId = movieId;
	}
	private int movieId;
	@Override
	public String toString() {
		return "MovieInfo [movieName=" + movieName + ", movieId=" + movieId + "]";
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
 
}
