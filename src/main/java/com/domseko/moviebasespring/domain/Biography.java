package com.domseko.moviebasespring.domain;

import javax.persistence.*;

@Entity
@Table(name = "biography")
public class Biography {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "notes")
    @Lob
    private String notes;

    @OneToOne
    private Actor actor;



/////////////////////////////////////////


    public Biography(Long id, String notes, Actor actor) {
        this.id = id;
        this.notes = notes;
        this.actor = actor;
    }



    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
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

    /*********************************************/
    @Override
    public String toString() {
        return "Biography{" +
                "id=" + id +
                ", notes='" + notes + '\'' +
                ", actor=" + actor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Biography biography = (Biography) o;

        return id != null ? id.equals(biography.id) : biography.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
