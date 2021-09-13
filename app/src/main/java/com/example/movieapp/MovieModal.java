package com.example.movieapp;

public class MovieModal {
    private String movieTitle, storyLine, releaseDate;
    private  int posterImgId;

    public MovieModal(String movieTitle, String storyLine, String releaseDate, int posterImgId) {
        this.movieTitle = movieTitle;
        this.storyLine = storyLine;
        this.releaseDate = releaseDate;
        this.posterImgId = posterImgId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getStoryLine() {
        return storyLine;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getPosterImgId() {
        return posterImgId;
    }
}
