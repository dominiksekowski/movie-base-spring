package com.domseko.moviebasespring.domain;

public class MovieBase {

    private Long id;

    private String productionDate;
    private String filmGenre;
    private String countryProduction;

    private Rate rate;

    public MovieBase(String productionDate, String filmGenre, String countryProduction, Rate rate) {
        this.productionDate = productionDate;
        this.filmGenre = filmGenre;
        this.countryProduction = countryProduction;
        this.rate = rate;
    }
}
