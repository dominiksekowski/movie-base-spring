package com.domseko.moviebasespring.domain;

import javax.persistence.*;

@Entity
public class MovieBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productionDate;
    private String filmGenre;
    private String countryProduction;

    @OneToOne
    private MovieDescription movieDescription;

    @Enumerated(value = EnumType.STRING)
    private Rate rate;


/////////////////////////////////////////


    public MovieBase(Long id, String productionDate, String filmGenre, String countryProduction, MovieDescription movieDescription, Rate rate) {
        this.id = id;
        this.productionDate = productionDate;
        this.filmGenre = filmGenre;
        this.countryProduction = countryProduction;
        this.movieDescription = movieDescription;
        this.rate = rate;
    }



    public MovieDescription getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(MovieDescription movieDescription) {
        this.movieDescription = movieDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public void setCountryProduction(String countryProduction) {
        this.countryProduction = countryProduction;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }
}
