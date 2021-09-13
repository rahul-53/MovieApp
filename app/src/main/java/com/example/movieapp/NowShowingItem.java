package com.example.movieapp;

import java.util.List;

public class NowShowingItem{

	private String year;

	private String releaseDate;

	private double imdbRating;

	private String title;

	private String duration;

	private List<String> actors;

	private String videoUrl;

	private String posterurl;

	private String originalTitle;

	private int averageRating;

	private String storyline;

	private String contentRating;

	private String id;

	public String getYear(){
		return year;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public double getImdbRating(){
		return imdbRating;
	}

	public String getTitle(){
		return title;
	}

	public String getDuration(){
		return duration;
	}

	public List<String> getActors(){
		return actors;
	}

	public String getVideoUrl(){
		return videoUrl;
	}

	public String getPosterurl(){
		return posterurl;
	}

	public String getOriginalTitle(){
		return originalTitle;
	}

	public int getAverageRating(){
		return averageRating;
	}

	public String getStoryline(){
		return storyline;
	}

	public String getContentRating(){
		return contentRating;
	}

	public String getId(){
		return id;
	}
}