package com.example.mongoDBBackend;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Movie {

	@Id
	private String id;

	private String name;

	private String category;

	private String director;
	
	private String rating;
	
	private int year;
	
	private int ageLimit;
	
	private List<String> genres;

	private List<String> actors;

	
	public Movie() {}

	public String getId() {return id;}

	public void setId(String id) {this.id = id;}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public String getCategory() {return category;}

	public void setCategory(String category) {this.category = category;}
	
	public String getDirector() {return director;}

	public void setDirector(String director) {this.director = director;}	
	
	public String getRating() {return rating;}

	public void setRating(String rating) {this.rating = rating;}
	
	public int getYear() {return year;}

	public void setYear(int year) {this.year = year;}
	
	public int getAgeLimit() {return ageLimit;}

	public void setAgeLimit(int ageLimit) {this.ageLimit = ageLimit;}		
	
	public List<String> getGenres() {return genres;}

	public void setGenres(List<String> genres) {this.genres = genres;}	
	
	public List<String> getActors() {return actors;}

	public void setActors(List<String> actors) {this.actors = actors;}		
}