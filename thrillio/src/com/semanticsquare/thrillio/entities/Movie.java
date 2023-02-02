package com.semanticsquare.thrillio.entities;

import com.semanticsquare.thrillio.constants.MovieGenre;

import java.util.Arrays;

public class Movie extends Bookmark {
    private int releaseYear;
    private String[] cast;
    private String[] directors;
    private String genre;
    private double imdbRating;

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public String[] getDirectors() {
        return directors;
    }

    public void setDirectors(String[] directors) {
        this.directors = directors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    // this done to override the default toString() method
    // Comment in to see what default method gives

    @Override
    public String toString() {
        return "Movie{" +
                "releaseYear=" + releaseYear +
                ", cast=" + Arrays.toString(cast) +
                ", directors=" + Arrays.toString(directors) +
                ", genre='" + genre + '\'' +
                ", imdbRating=" + imdbRating +
                '}';
    }

    @Override
    public boolean isKidFriendlyEligible() {
        if(genre.equals(MovieGenre.HORROR) || genre.equals(MovieGenre.THRILLERS)){
            return false;
        }
        return true;
    }
}