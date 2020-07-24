package com.domseko.moviebasespring.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class MovieDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String movieTitle;

    @Lob
    private Byte image;
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


    public MovieDescription(Long id, String movieTitle, Byte image, String notes, MovieBase movieBase, Director director, Scenarist scenarist, Set<Actor> actor) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.image = image;
        this.notes = notes;
        this.movieBase = movieBase;
        this.director = director;
        this.scenarist = scenarist;
        this.actor = actor;
    }



    public MovieBase getMovieBase() {
        return movieBase;
    }

    public void setMovieBase(MovieBase movieBase) {
        this.movieBase = movieBase;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Scenarist getScenarist() {
        return scenarist;
    }

    public void setScenarist(Scenarist scenarist) {
        this.scenarist = scenarist;
    }

    public Set<Actor> getActor() {
        return actor;
    }

    public void setActor(Set<Actor> actor) {
        this.actor = actor;
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

    /*********************************************/

    @Override
    public String toString() {
        return "MovieDescription{" +
                "id=" + id +
                ", movieTitle='" + movieTitle + '\'' +
                ", image=" + image +
                ", notes='" + notes + '\'' +
                ", movieBase=" + movieBase +
                ", director=" + director +
                ", scenarist=" + scenarist +
                ", actor=" + actor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieDescription that = (MovieDescription) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
