package com.domseko.moviebasespring.domain;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie_base")
public class MovieBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private String productionDate;

    @Column(name = "film_genre")
    private String filmGenre;

    @Column(name = "country_production")
    private String countryProduction;

    @OneToOne
    private MovieDescription movieDescription;

    @Enumerated(value = EnumType.STRING)
    private Rate rate;


/////////////////////////////////////////


}
