package com.domseko.moviebasespring.domain;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "movie_base")
public class MovieBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private Integer productionDate;

    @Column(name = "film_genre")
    private String filmGenre;

    @Column(name = "country_production")
    private String countryProduction;

    @Enumerated(value = EnumType.STRING)
    private Rate rate;

    @OneToOne(cascade = CascadeType.ALL)
    private MovieDescription movieDescription;




/////////////////////////////////////////


    public MovieBase(Integer productionDate, String filmGenre, String countryProduction, Rate rate) {
        this.productionDate = productionDate;
        this.filmGenre = filmGenre;
        this.countryProduction = countryProduction;
        this.rate = rate;
    }
}
