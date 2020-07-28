package com.domseko.moviebasespring.domain;

import javax.persistence.*;
import java.util.Set;

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
    private Set<MovieDescription> movieDescriptions;


/////////////////////////////////////////


    public Scenarist(Long id, String firstName, String lastName, Set<MovieDescription> movieDescriptions) {
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
        return "Scenarist{" +
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

        Scenarist scenarist = (Scenarist) o;

        return id != null ? id.equals(scenarist.id) : scenarist.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
