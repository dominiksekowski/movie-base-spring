package com.domseko.moviebasespring.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "movie_description")
public class MovieDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "movie_title")
    private String movieTitle;


    @Column(name = "image")
    @Lob
    private Byte image;

    @Column(name = "notes")
    @Lob
    private String notes;

    @OneToOne(cascade = CascadeType.ALL)
    private MovieBase movieBase;

    @ManyToOne
    private Director director;

    @ManyToOne
    private Scenarist scenarist;

    @ManyToMany
    @JoinTable(name = "movie_actors",
        joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private Set<Actor>actor;



/////////////////////////////////////////



}
