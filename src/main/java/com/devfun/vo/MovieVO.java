package com.devfun.vo;

public class MovieVO {
	private int movie_id;
	private String movie_name;
	private String director;
	private String types;
	private String moviecol;

	public int getMovie_id() {
		return movie_id;
	}
	
	public String getMovie_name() {
		return movie_name;
	}
	
	public String getDirector() {
		return director;
	}
	
	public String getTypes() {
		return types;
	}
	
	public String getMovieCol() {
		return moviecol;
	}
	
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	
	public void setDirector(String movie_name) {
		this.movie_name = movie_name;
	}
	
	public void setTypes(String types) {
		this.types = types;
	}
	
	public void setMoviecol(String moviecol) {
		this.moviecol = moviecol;
	}
}

