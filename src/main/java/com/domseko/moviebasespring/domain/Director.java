package com.domseko.moviebasespring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "director")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "director")
    private Set<MovieDescription> movieDescriptions = new HashSet<>();;



/////////////////////////////////////////


    public Director(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
