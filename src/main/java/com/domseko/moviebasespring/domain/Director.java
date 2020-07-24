package com.domseko.moviebasespring.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "director")
    private Set<MovieDescription> movieDescriptions;



/////////////////////////////////////////


    public Director(Long id, String firstName, String lastName, Set<MovieDescription> movieDescriptions) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movieDescriptions = movieDescriptions;
    }



    public Set<MovieDescription> getMovieDescriptions() {
        return movieDescriptions;
    }

    public void setMovieDescriptions(Set<MovieDescription> movieDescriptions) {
        this.movieDescriptions = movieDescriptions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*********************************************/

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", movieDescriptions=" + movieDescriptions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Director director = (Director) o;

        return id != null ? id.equals(director.id) : director.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
