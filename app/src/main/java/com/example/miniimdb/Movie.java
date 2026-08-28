package com.example.miniimdb;

import java.util.ArrayList;

public class Movie {

    private String title;
    private String genre;
    private double rating;
    private String description;
    private int posterResId;
    private ArrayList<Actor> actors;
    private boolean favorite;
    private float userRating;

    public Movie(String title, String genre, double rating,
                 String description, int posterResId,
                 ArrayList<Actor> actors) {

        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.description = description;
        this.posterResId = posterResId;
        this.actors = actors;
        this.favorite = false;
        this.userRating = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public int getPosterResId() {
        return posterResId;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public float getUserRating() {
        return userRating;
    }

    public void setUserRating(float userRating) {
        this.userRating = userRating;
    }
}