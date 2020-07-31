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
@Table(name = "scenarist")
public class Scenarist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "scenarist")
    private Set<MovieDescription> movieDescriptions = new HashSet<>();;


/////////////////////////////////////////


    public Scenarist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
