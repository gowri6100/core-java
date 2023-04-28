package com.xworkz.movies.dto;

public class Moviesdto {

	private String movieName;
	private String heroName;
	private String type;
	private int budget;
	private int collection;
	private String nameOfTheDirector;

	public Moviesdto() {
		System.out.println("default constructor");
	}

	public Moviesdto(String movieName, String heroName, String type, int budget, int collection,
			String nameOfTheDirector) {
		super();
		this.movieName = movieName;
		this.heroName = heroName;
		this.type = type;
		this.budget = budget;
		this.collection = collection;
		this.nameOfTheDirector = nameOfTheDirector;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getCollection() {
		return collection;
	}

	public void setCollection(int collection) {
		this.collection = collection;
	}

	public String getNameOfTheDirector() {
		return nameOfTheDirector;
	}

	public void setNameOfTheDirector(String nameOfTheDirector) {
		this.nameOfTheDirector = nameOfTheDirector;
	}

	@Override
	public String toString() {
		return "Moviesdto [movieName=" + movieName + ", heroName=" + heroName + ", type=" + type + ", budget=" + budget
				+ ", collection=" + collection + ", nameOfTheDirector=" + nameOfTheDirector + "]";
	}

}
