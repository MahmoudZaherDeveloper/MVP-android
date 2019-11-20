package com.mahmoud.zaher.mvpapplication.pojo;

public class MovieModel {
    int movieId;
    String movieName;
    String movieDesc;

    public MovieModel(int movieId, String movieName, String movieDesc) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDesc = movieDesc;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }
}
