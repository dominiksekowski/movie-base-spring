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


    @OneToOne
    private MovieBase movieBase;

    @ManyToOne
    private Director director;

    @ManyToOne
    private Scenarist scenarist;

    @ManyToMany
    @JoinTable(name = "movie_actors",
        joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private Set<Actor>actor = new HashSet<>();;



/////////////////////////////////////////


    public MovieDescription(String movieTitle, String notes) {
        this.movieTitle = movieTitle;
        this.notes = notes;
    }
}
