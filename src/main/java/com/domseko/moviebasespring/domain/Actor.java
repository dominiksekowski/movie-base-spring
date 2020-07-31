package com.domseko.moviebasespring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "actor")
public class Actor  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "birth_date")
    private Integer birthDate;

    @Column(name = "birth_place")
    private String birthPlace;

    @Column(name = "growth")
    private Integer growth;


    @OneToOne(cascade = CascadeType.ALL)
    private Biography biography;

//    @ManyToMany(mappedBy = "actors")
//    private Set<MovieDescription> movieDescriptions = new HashSet<>();



/////////////////////////////////////////


    public Actor(String firstName, String lastName, Integer age, Integer birthDate, String birthPlace, Integer growth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.growth = growth;
    }

}
