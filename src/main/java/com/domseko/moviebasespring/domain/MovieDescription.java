package com.domseko.moviebasespring.domain;

public class MovieDescription {

    private Long id;

    private String notes;
    private String movieTitle;

    private Byte image;

    public MovieDescription(String notes, String movieTitle, Byte image) {
        this.notes = notes;
        this.movieTitle = movieTitle;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Byte getImage() {
        return image;
    }

    public void setImage(Byte image) {
        this.image = image;
    }
}
